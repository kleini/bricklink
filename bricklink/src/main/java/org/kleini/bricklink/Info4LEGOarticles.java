/*
 * GPLv3
 */

package org.kleini.bricklink;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.ItemNumberRequest;
import org.kleini.bricklink.api.ItemNumberResponse;
import org.kleini.bricklink.api.PriceGuideRequest;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemMapping;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * This class is a starter to evaluate the margin of parts offered within LUGBULK.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Info4LEGOarticles {

    public Info4LEGOarticles() {
        super();
    }

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        List<String[]> input;
        try (
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            CSVReader csvr = new CSVReader(isr, ';', CSVWriter.DEFAULT_QUOTE_CHARACTER);
        ) {
            input = csvr.readAll();
        }
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        List<String[]> output = new ArrayList<String[]>();
        try {
            for (String[] line : input) {
                List<String> row = new ArrayList<String>();
                for (String tmp : line) {
                    row.add(tmp);
                }
                String legoId = line[0];
                int identifier;
                try {
                    identifier = Integer.parseInt(legoId);
                } catch (NumberFormatException e) {
                    throw e;
                }
                ItemNumberResponse response = client.execute(new ItemNumberRequest(identifier));
                if (response.getItemMapping().size() != 1) {
                    System.out.println(response.getItemMapping().toString());
                    output.add(row.toArray(new String[row.size()]));
                    continue;
                }
                ItemMapping mapping = response.getItemMapping().get(0);
                System.out.println(mapping.toString());
                String itemID = mapping.getItem().getIdentifier();
                row.add(itemID);
                int colorID = mapping.getColor().getIdentifier();
                row.add(Integer.toString(colorID));
                ItemType type = mapping.getType() == null ? mapping.getItem().getType() : mapping.getType();
                PriceGuide soldGuide = client.execute(new PriceGuideRequest(type, itemID, colorID, GuideType.SOLD, Condition.N)).getPriceGuide();
                PriceGuide stockGuide = client.execute(new PriceGuideRequest(type, itemID, colorID, GuideType.STOCK, Condition.N)).getPriceGuide();
                BigDecimal quantityAveragePrice = soldGuide.getQuantityAveragePrice();
                row.add(quantityAveragePrice.toString());
                row.add(Integer.toString(stockGuide.getQuantity()));
                row.add(Integer.toString(soldGuide.getQuantity()));
                output.add(row.toArray(new String[row.size()]));
            }
        } finally {
            client.close();
        }
        FileOutputStream fis = null;
        OutputStreamWriter osw = null;
        CSVWriter csvw = null;
        try {
            fis = new FileOutputStream(new File("lugbulk.csv"));
            osw = new OutputStreamWriter(fis, "UTF-8");
            csvw = new CSVWriter(osw, ';', CSVWriter.DEFAULT_QUOTE_CHARACTER, CSVWriter.DEFAULT_ESCAPE_CHARACTER, "\n");
            csvw.writeAll(output);
        } finally {
            IOUtils.closeQuietly(osw);
            IOUtils.closeQuietly(fis);
            if (null != csvw) {
                csvw.close();
            }
        }
    }
}

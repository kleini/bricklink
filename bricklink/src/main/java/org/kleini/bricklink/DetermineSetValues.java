/*
 * GPL v3
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

import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.bricklink.selenium.data.PartOutData;

import au.com.bytecode.opencsv.CSVParser;
import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class DetermineSetValues {

    public DetermineSetValues() {
        super();
    }

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        List<String[]> lines;
        try (
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            CSVReader reader = new CSVReader(isr, ';', CSVParser.DEFAULT_QUOTE_CHARACTER, false);
        ) {
            lines = reader.readAll();
        }
        Configuration configuration = new Configuration();
        BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        List<String[]> output = new ArrayList<String[]>();
        try {
            for (String[] values : lines) {
                String itemId = values[0];
                BigDecimal value = BigDecimal.ZERO;
                try {
                    PartOutData data = selenium.getPartOutValue(ItemType.SET, itemId);
                    value = data.getValue();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String[] extended = new String[values.length + 1];
                System.arraycopy(values, 0, extended, 0, values.length);
                extended[values.length] = value.toString();
                output.add(extended);
            }
        } finally {
            selenium.close();
        }
        try (
            FileOutputStream fos = new FileOutputStream(new File(args[1]));
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            CSVWriter csvw = new CSVWriter(osw, ';', CSVWriter.DEFAULT_QUOTE_CHARACTER, "\r\n");
        ) {
            csvw.writeAll(output);
        }
    }
}

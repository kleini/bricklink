/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.PriceGuideRequest;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Item;
import au.com.bytecode.opencsv.CSVWriter;

/**
 * This class is a starter and it implements to read certain values from the BrickLink price guide and writes them as a CSV file.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class PriceGuideValues2CSV {

    public PriceGuideValues2CSV() {
        super();
    }

    public static void main(String[] args) throws Exception {
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        File file = new File(args[0]);
        final BrickStoreXML brickStore = deSerializer.load(file);
        Configuration configuration = new Configuration();
        List<String[]> output = new ArrayList<String[]>();
        try (BrickLinkClient client = new BrickLinkClient(configuration)) {
            for (Item item : brickStore.getInventory().getItem()) {
                List<String> row = new ArrayList<String>();
                row.add(item.getItemID());
                row.add(Integer.toString(item.getColorID()));
                PriceGuide soldGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.SOLD, Condition.valueOf(item.getCondition()))).getPriceGuide();
                PriceGuide stockGuide = client.execute(new PriceGuideRequest(ItemType.byID(item.getItemTypeID()), item.getItemID(), item.getColorID(), GuideType.STOCK, Condition.valueOf(item.getCondition()))).getPriceGuide();
                row.add(Integer.toString(soldGuide.getQuantity()));
                row.add(Integer.toString(stockGuide.getQuantity()));
                output.add(row.toArray(new String[row.size()]));
            }
        }
        try (
            FileOutputStream fos = new FileOutputStream(args[1]);
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
            CSVWriter csvw = new CSVWriter(osw);
        ) {
            csvw.writeAll(output);
        }
    }
}

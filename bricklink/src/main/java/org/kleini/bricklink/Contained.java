/*
 * GPLv3
 */

package org.kleini.bricklink;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.SupersetsRequest;
import org.kleini.bricklink.api.SupersetsResponse;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.Item;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.Superset;
import org.kleini.bricklink.data.SupersetEntry;
import au.com.bytecode.opencsv.CSVReader;

/**
 * {@link Contained}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Contained {

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println(Contained.class.getName() + " file.csv");
            System.exit(1);
        }
        Configuration configuration = new Configuration();
        List<String[]> partList;
        try (
            FileInputStream fis = new FileInputStream(args[0]);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            CSVReader csvr = new CSVReader(isr);
        ) {
            partList = csvr.readAll();
        }
        Set<Item> intersection = new HashSet<Item>();
        try (
            BrickLinkClient client = new BrickLinkClient(configuration);
        ) {
            boolean first = true;
            for (String[] part : partList) {
                StringBuilder sb = new StringBuilder();
                for (String tmp : part) {
                    sb.append(tmp);
                    sb.append(',');
                }
                sb.setLength(sb.length() - 1);
                System.out.println(sb);
                SupersetsRequest request;
                if (part.length == 3) {
                    request = new SupersetsRequest(ItemType.byID(part[0]), part[1], Color.byName(part[2]));
                } else if (2 == part.length) {
                    request = new SupersetsRequest(ItemType.byID(part[0]), part[1]);
                } else {
                    throw new Exception("Need item type, identifier and optional color in CSV.");
                }
                SupersetsResponse response = client.execute(request);
                Set<Item> items = new HashSet<Item>();
                for (Superset set : response.getSupersets()) {
                    System.out.println(set.getColor() + ":");
                    for (SupersetEntry entry : set.getEntries()) {
                        System.out.println("  " + entry);
                        items.add(entry.getItem());
                    }
                }
                if (first) {
                    intersection.addAll(items);
                } else {
                    intersection.retainAll(items);
                }
                first = false;
            }
        }
        System.out.println("Intersection: ");
        for (Item item : intersection) {
            System.out.println(item);
        }
    }
}

/*
 * GPLv3
 */

package org.kleini.bricklink;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.api.ItemRequest;
import org.kleini.bricklink.api.ItemResponse;
import org.kleini.bricklink.api.KnownColorsRequest;
import org.kleini.bricklink.api.KnownColorsResponse;
import org.kleini.bricklink.data.Category;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.KnownColor;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Inventory;
import org.kleini.brickstore.data.Item;

/**
 * Writes all parts of some category into a BrickStore file.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoryParts {

    public CategoryParts() {
        super();
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.out.println(CategoryParts.class.getName() + " category identifier");
            System.exit(1);
        }
        Category category = Category.byId(Integer.parseInt(args[0]));
        Configuration configuration = new Configuration();
        List<String> parts;
        try (BrickLinkSelenium selenium = new BrickLinkSelenium(configuration)) {
            parts = selenium.getCategoryParts(category);
        }
        List<Item> items = new LinkedList<Item>();
        for (String part : parts) {
            Item item = new Item();
            item.setStatus("I");
            item.setItemID(part);
            item.setCategoryID(category.getIdentifier());
            item.setCategoryName(category.getName());
            item.setQty(1);
            item.setCondition(Condition.N.name());
            items.add(item);
        }
        try (BrickLinkClient client = new BrickLinkClient(configuration)) {
            for (Item item : items) {
                ItemResponse response1 = client.execute(new ItemRequest(ItemType.PART, item.getItemID()));
                item.setItemName(response1.getItem().getName());
                item.setItemTypeID(response1.getItem().getType().getId());
                item.setItemTypeName(response1.getItem().getType().getLongId());
                KnownColorsResponse response2 = client.execute(new KnownColorsRequest(ItemType.PART, item.getItemID()));
                List<KnownColor> colors = response2.getKnownColors();
                if (colors.size() == 1) {
                    Color color = colors.get(0).getColor();
                    item.setColorID(color.getIdentifier());
                    item.setColorName(color.getName());
                } else {
                    System.out.println("Item " + item.getItemName() + " has " + colors.size() + " known colors.");
                    item.setColorID(Color.NOT_APPLICABLE.getIdentifier());
                    item.setColorName(Color.NOT_APPLICABLE.getName());
                }
            }
        }
        try (BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);) {
            for (Item item : items) {
                if (item.getColorID() == Color.NOT_APPLICABLE.getIdentifier()) {
                    Color color = selenium.guessColor(ItemType.PART,
                            item.getItemID());
                    if (Color.NOT_APPLICABLE.equals(color)) {
                        System.out.println("Guessing color for part "
                                + item.getItemID() + " failed.");
                    } else {
                        item.setColorID(color.getIdentifier());
                        item.setColorName(color.getName());
                    }
                }
            }
        }
        BrickStoreXML brickStore = new BrickStoreXML();
        Inventory inventory = new Inventory();
        brickStore.setInventory(inventory);
        inventory.setItem(items);
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        deSerializer.save(brickStore, new File(category.getIdentifier() + ".bsx"));
    }

}

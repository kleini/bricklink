/*
 * GPLv3
 */

package org.kleini.bricklink.tools;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.CategoryListRequest;
import org.kleini.bricklink.api.Category;
import org.kleini.bricklink.api.Color;
import org.kleini.bricklink.api.ColorsRequest;
import org.kleini.bricklink.api.Configuration;

/**
 * {@link ColorsAndCategories}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class ColorsAndCategories {

    public ColorsAndCategories() {
        super();
    }

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        BrickLinkClient client = new BrickLinkClient(configuration);
        final List<Color> colors;
        final List<Category> categories;
        try {
            colors = client.execute(new ColorsRequest()).getColors();
            categories = client.execute(new CategoryListRequest()).getCategories();
        } finally {
            client.close();
        }
        Collections.sort(colors, new Comparator<Color>() {
            @Override
            public int compare(Color o1, Color o2) {
                return o1.getIdentifier() == o2.getIdentifier() ? 0 : o1.getIdentifier() > o2.getIdentifier() ? 1 : -1;
            }
        });
        for (Color color : colors) {
            String constant = color.getName();
            constant = constant.replace(",", "");
            constant = constant.replace(" ", "_");
            constant = constant.replace("-", "_");
            constant = constant.toUpperCase(Locale.ENGLISH);
            System.out.println("    " + constant + '(' + color.getIdentifier() + ", \"" + color.getName() + "\"),");
        }
        Collections.sort(categories, new Comparator<Category>() {
            @Override
            public int compare(Category o1, Category o2) {
                return o1.getIdentifier() == o2.getIdentifier() ? 0 : o1.getIdentifier() > o2.getIdentifier() ? 1 : -1;
            }
        });
        // TODO eliminate duplicates, years, #40; (, /, #41; ), .
        for (Category category : categories) {
            String constant = category.getName();
            constant = constant.replace(",", "");
            constant = constant.replace(" ", "_");
            constant = constant.replace("-", "_");
            constant = constant.replace("&", "AND");
            constant = constant.replace("'", "");
            constant = constant.toUpperCase(Locale.ENGLISH);
            System.out.println("    " + constant + '(' + category.getIdentifier() + ", \"" + category.getName() + "\"),");
        }
    }
}

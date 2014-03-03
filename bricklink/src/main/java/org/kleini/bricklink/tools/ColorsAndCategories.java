/*
 * GPLv3
 */

package org.kleini.bricklink.tools;

import java.util.List;
import java.util.Locale;
import org.kleini.bricklink.api.BrickLinkClient;
import org.kleini.bricklink.api.CategoriesRequest;
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
            categories = client.execute(new CategoriesRequest()).getCategories();
        } finally {
            client.close();
        }
        for (Color color : colors) {
            String constant = color.getName();
            constant = constant.replace(",", "");
            constant = constant.replace(" ", "_");
            constant = constant.replace("-", "_");
            constant = constant.toUpperCase(Locale.ENGLISH);
            System.out.println("    " + constant + '(' + color.getIdentifier() + ", \"" + color.getName() + "\"),");
        }
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

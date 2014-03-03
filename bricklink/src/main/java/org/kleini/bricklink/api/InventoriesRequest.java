/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.Category;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.ItemType;

/**
 * {@link InventoriesRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class InventoriesRequest implements Request<InventoriesResponse> {

    private final ItemType type;

    private final Status status;

    private final Category category;

    private final Color color;

    public InventoriesRequest(ItemType type, Status status, Category category, Color color) {
        super();
        this.type = type;
        this.status = status;
        this.category = category;
        this.color = color;
    }

    @Override
    public String getPath() {
        return "inventories";
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[] {
            // API description is wrong. The value must not be "part". It must be "P".
            new Parameter("item_type", type.getId()),
            new Parameter("status", status.getIdentifier()),
            new Parameter("category_id", category.getIdentifier()),
            new Parameter("color_id", color.getIdentifier())
        };
    }

    @Override
    public InventoriesParser getParser() {
        return new InventoriesParser();
    }

    public enum Status {
        AVAILABLE('Y'),
        STOCKROOM_A('S');

        private final char identifier;

        Status(char identifier) {
            this.identifier = identifier;
        }

        public char getIdentifier() {
            return identifier;
        }
    }
}

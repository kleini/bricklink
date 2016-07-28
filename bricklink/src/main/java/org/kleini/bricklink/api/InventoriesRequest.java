/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.ArrayList;
import java.util.List;

import org.kleini.api.Parameter;
import org.kleini.bricklink.data.Category;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.ItemType;

/**
 * {@link InventoriesRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class InventoriesRequest extends AbstractGetRequest<InventoriesResponse> {

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
        List<Parameter> params = new ArrayList<Parameter>();
        if (null != type) {
            params.add(new Parameter("item_type", type.getLongId()));
        }
        if (null != status) {
            params.add(new Parameter("status", status.getIdentifier()));
        }
        if (null != category) {
            params.add(new Parameter("category_id", category.getIdentifier()));
        }
        if (null != color) {
            params.add(new Parameter("color_id", color.getIdentifier()));
        }
        return params.toArray(new Parameter[params.size()]);
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

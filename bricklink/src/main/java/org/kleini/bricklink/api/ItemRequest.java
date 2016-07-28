/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parameter;
import org.kleini.bricklink.data.ItemType;

/**
 * {@link ItemRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class ItemRequest extends AbstractGetRequest<ItemResponse> {

    private final ItemType type;
    private final String identifier;

    public ItemRequest(ItemType type, String identifier) {
        super();
        this.type = type;
        this.identifier = identifier;
    }

    @Override
    public String getPath() {
        return "items/" + type.getLongId() + "/" + identifier;
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public ItemParser getParser() {
        return new ItemParser();
    }
}

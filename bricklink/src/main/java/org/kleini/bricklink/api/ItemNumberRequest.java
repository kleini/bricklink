/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parameter;

/**
 * {@link ItemNumberRequest} can be used to resolve a LEGO article number to the according BrickLink part, type and color.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class ItemNumberRequest extends AbstractGetRequest<ItemNumberResponse> {

    private final int elementId;

    public ItemNumberRequest(int elementId) {
        super();
        this.elementId = elementId;
    }

    @Override
    public String getPath() {
        return "item_mapping/" + Integer.toString(elementId);
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public ItemNumberParser getParser() {
        return new ItemNumberParser();
    }
}

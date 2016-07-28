/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parameter;
import org.kleini.bricklink.data.ItemType;

/**
 * {@link KnownColorsRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class KnownColorsRequest extends AbstractGetRequest<KnownColorsResponse> {

    private final ItemType type;
    private final String identifier;

    public KnownColorsRequest(ItemType type, String identifier) {
        super();
        this.type = type;
        this.identifier = identifier;
    }

    @Override
    public String getPath() {
        return "items/" + type.getLongId() + "/" + identifier + "/colors";
    }

    @Override
    public Parameter[] getParameters() {
        return Parameter.EMPTY;
    }

    @Override
    public KnownColorsParser getParser() {
        return new KnownColorsParser();
    }
}

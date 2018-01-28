/*
 * GPLv3
 */

package org.kleini.bricklink.api;

import java.util.LinkedList;
import java.util.List;
import org.kleini.api.AbstractGetRequest;
import org.kleini.api.Parameter;
import org.kleini.bricklink.data.ItemType;

/**
 * {@link SupersetsRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class SupersetsRequest extends AbstractGetRequest<SupersetsResponse> {

    private final ItemType type;
    private final String identifier;
    private final org.kleini.bricklink.data.Color color;

    public SupersetsRequest(ItemType type, String identifier, org.kleini.bricklink.data.Color color) {
        super();
        this.type = type;
        this.identifier = identifier;
        this.color = color;
    }

    public SupersetsRequest(ItemType type, String identifier) {
        this(type, identifier, null);
    }

    @Override
    public String getPath() {
        return "items/" + type.getLongId() + '/' + identifier + "/supersets";
    }

    @Override
    public Parameter[] getParameters() {
        List<Parameter> retval = new LinkedList<Parameter>();
        if (null != color) {
            retval.add(new Parameter("color_id", color.getIdentifier()));
        }
        return retval.toArray(new Parameter[retval.size()]);
    }

    @Override
    public SupersetsParser getParser() {
        return new SupersetsParser();
    }
}

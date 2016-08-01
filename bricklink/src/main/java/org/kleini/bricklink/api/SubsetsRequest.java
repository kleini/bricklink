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
 * {@link SubsetsRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class SubsetsRequest extends AbstractGetRequest<SubsetsResponse> {

    private final ItemType type;
    private final String itemID;
    private final Color color;

    public SubsetsRequest(ItemType type, String itemID, Color color) {
        super();
        this.type = type;
        this.itemID = itemID;
        this.color = color;
    }

    public SubsetsRequest(ItemType type, String itemID) {
        this(type, itemID, null);
    }

    @Override
    public String getPath() {
        return "items/" + type.getLongId() + '/' + itemID + "/subsets";
    }

    @Override
    public Parameter[] getParameters() {
        List<Parameter> retval = new LinkedList<Parameter>();
        if (null != color) {
            retval.add(new Parameter("color_id", color.getIdentifier()));
        }
        retval.add(new Parameter("box", true));
        retval.add(new Parameter("instruction", true));
        retval.add(new Parameter("break_minifigs", false));
        retval.add(new Parameter("break_subsets", false));
        return retval.toArray(new Parameter[retval.size()]);
    }

    @Override
    public SubsetsParser getParser() {
        return new SubsetsParser();
    }
}

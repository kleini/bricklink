/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import java.util.ArrayList;
import java.util.List;
import org.kleini.address.Country;
import org.kleini.api.AbstractGetRequest;
import org.kleini.api.Parameter;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.Currency;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.Region;

/**
 * {@link PriceGuideRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideRequest extends AbstractGetRequest<PriceGuideResponse> {

    private final ItemType type;
    private final String itemID;
    private final int colorID;
    private final GuideType guideType;
    private final Condition newOrUsed;
    private final Country country;
    private final Region region;

    public PriceGuideRequest(ItemType type, String itemID, int colorID, GuideType guideType, Condition newOrUsed, Country country) {
        super();
        this.type = type;
        this.itemID = itemID;
        this.colorID = colorID;
        this.guideType = guideType;
        this.newOrUsed = newOrUsed;
        this.country = country;
        this.region = null;
    }

    public PriceGuideRequest(ItemType type, String itemID, int colorID, GuideType guideType, Condition newOrUsed, Region region) {
        super();
        this.type = type;
        this.itemID = itemID;
        this.colorID = colorID;
        this.guideType = guideType;
        this.newOrUsed = newOrUsed;
        this.country = null;
        this.region = region;
    }

    public PriceGuideRequest(ItemType type, String itemID, int colorID, GuideType guideType, Condition newOrUsed) {
        this(type, itemID, colorID, guideType, newOrUsed, (Country) null);
    }

    @Override
    public String getPath() {
        return "items/" + type.name().toLowerCase() + '/' + itemID + "/price";
    }

    @Override
    public Parameter[] getParameters() {
        List<Parameter> retval = new ArrayList<Parameter>();
        retval.add(new Parameter("color_id", colorID));
        retval.add(new Parameter("guide_type", guideType.getParamValue()));
        retval.add(new Parameter("new_or_used", newOrUsed.name()));
        retval.add(new Parameter("currency_code", Currency.EUR.name()));
        if (null != country) {
            retval.add(new Parameter("country_code", country.name()));
        }
        if (null != region) {
            retval.add(new Parameter("region", region.name().toLowerCase()));
        }
        retval.add(new Parameter("vat", "Y")); // Vat option must be Y, N, or O
        return retval.toArray(new Parameter[retval.size()]);
    }

    @Override
    public PriceGuideParser getParser() {
        return new PriceGuideParser();
    }
}

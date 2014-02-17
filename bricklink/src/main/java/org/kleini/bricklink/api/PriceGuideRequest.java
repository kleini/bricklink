/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.bricklink.data.Currency;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.Condition;

/**
 * {@link PriceGuideRequest}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideRequest implements Request<PriceGuideResponse> {

    private final ItemType type;
    private final String itemID;
    private final int colorID;
    private final Condition newOrUsed;

    public PriceGuideRequest(ItemType type, String itemID, int colorID, Condition newOrUsed) {
        super();
        this.type = type;
        this.itemID = itemID;
        this.colorID = colorID;
        this.newOrUsed = newOrUsed;
    }

    @Override
    public String getPath() {
        return "items/" + type.name().toLowerCase() + '/' + itemID + "/price";
    }

    @Override
    public Parameter[] getParameters() {
        return new Parameter[] {
            new Parameter("color_id", colorID),
            new Parameter("quide_type", "sold"),
            new Parameter("new_or_used", newOrUsed.name()),
            new Parameter("currency_code", Currency.EUR.name())
        };
    }

    @Override
    public PriceGuideParser getParser() {
        return new PriceGuideParser();
    }
}

/*
 * GPLv3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.PriceDetail;
import org.kleini.bricklink.data.PriceGuide;

/**
 * {@link PriceGuideTools}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideTools {

    private PriceGuideTools() {
        super();
    }

    public static List<PriceDetail> extract(Collection<PriceDetail> details, Country country) {
        List<PriceDetail> retval = new ArrayList<PriceDetail>();
        for (PriceDetail detail : details) {
            if (country == detail.getSellerCountry()) {
                retval.add(detail);
            }
        }
        return retval;
    }

    public static PriceGuide calculate(List<PriceDetail> details) throws Exception {
        if (details.isEmpty()) {
            throw new Exception("Price detail list is empty.");
        }
        PriceGuide retval = new PriceGuide();
        retval.setDetail(details);
        retval.setAveragePrice(calculateAverage(details));
        retval.setQuantityAveragePrice(calculateQuantityAverage(details));
        retval.setMaxPrice(getMaximum(details));
        retval.setMinPrice(getMinimum(details));
        return retval;
    }

    private static BigDecimal calculateAverage(List<PriceDetail> details) {
        BigDecimal sum = new BigDecimal(0);
        for (PriceDetail detail : details) {
            sum = sum.add(detail.getPrice());
        }
        return sum.divide(new BigDecimal(details.size()), 4, RoundingMode.HALF_UP);
    }

    private static BigDecimal calculateQuantityAverage(List<PriceDetail> details) {
        BigDecimal sum = new BigDecimal(0);
        int count = 0;
        for (PriceDetail detail : details) {
            sum = sum.add(detail.getPrice().multiply(new BigDecimal(detail.getQuantity())));
            count += detail.getQuantity();
        }
        return sum.divide(new BigDecimal(count), 4, RoundingMode.HALF_UP);
    }

    private static BigDecimal getMaximum(List<PriceDetail> details) {
        BigDecimal retval = details.get(0).getPrice();
        for (PriceDetail detail : details) {
            retval = detail.getPrice().max(retval);
        }
        return retval;
    }

    private static BigDecimal getMinimum(List<PriceDetail> details) {
        BigDecimal retval = details.get(0).getPrice();
        for (PriceDetail detail : details) {
            retval = detail.getPrice().min(retval);
        }
        return retval;
    }

    /**
     * @return 0-based selling position with given quantity and price.
     */
    public static int getMyPosition(int quantity, BigDecimal price, List<PriceDetail> details) throws Exception {
        for (int i = 0; i < details.size(); i++) {
            PriceDetail detail = details.get(i);
            switch (price.compareTo(detail.getPrice())) {
            case -1:
                return i;
            case 0:
                if (quantity > detail.getQuantity()) {
                    return i;
                }
                break;
            case 1:
                // Nothing to do. Compare with next.
                break;
            default:
                throw new Exception("Should not happen.");
            }
        }
        return details.size();
    }
}

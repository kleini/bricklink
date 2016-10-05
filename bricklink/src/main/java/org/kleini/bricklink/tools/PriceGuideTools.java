/*
 * GPLv3
 */

package org.kleini.bricklink.tools;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

import org.kleini.address.Country;
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

    public static PriceGuide extract(PriceGuide guide, Country... countries) {
        PriceGuide retval = new PriceGuide();
        List<PriceDetail> list = new ArrayList<PriceDetail>();
        BigDecimal minPrice = null;
        BigDecimal maxPrice = null;
        List<BigDecimal> forAverage = new ArrayList<BigDecimal>();
        BigDecimal quantityAveragePrice = BigDecimal.ZERO;
        int scale = 0;
        int units = 0;
        int quantity = 0;
        EnumSet<Country> set = EnumSet.copyOf(java.util.Arrays.asList(countries));
        for (PriceDetail detail : guide.getDetail()) {
            if (set.contains(detail.getSellerCountry())) {
                list.add(detail);
                if (null == minPrice) {
                    minPrice = maxPrice = detail.getPrice();
                }
                minPrice = minPrice.min(detail.getPrice());
                maxPrice = maxPrice.max(detail.getPrice());
                forAverage.add(detail.getPrice());
                quantityAveragePrice = quantityAveragePrice.add(detail.getPrice().multiply(new BigDecimal(detail.getQuantity())));
                scale = Math.max(scale, detail.getPrice().scale());
                units++;
                quantity += detail.getQuantity();
            }
        }
        retval.setDetail(list);
        retval.setItem(guide.getItem());
        retval.setNewOrUsed(guide.getNewOrUsed());
        retval.setCurrency(guide.getCurrency());
        retval.setMinPrice(minPrice);
        retval.setMaxPrice(maxPrice);
        retval.setAveragePrice(0 == forAverage.size() ? null : DecimalTools.getAverage(forAverage.toArray(new BigDecimal[forAverage.size()])));
        retval.setQuantityAveragePrice(0 == quantity ? null : quantityAveragePrice.divide(new BigDecimal(quantity), scale, RoundingMode.HALF_UP));
        retval.setUnits(units);
        retval.setQuantity(quantity);
        return retval;
    }

    public static List<PriceDetail> removeStore(List<PriceDetail> details, String name) {
        List<PriceDetail> retval = new ArrayList<PriceDetail>(details);
        Iterator<PriceDetail> iter = retval.iterator();
        while (iter.hasNext()) {
            PriceDetail detail = iter.next();
            if (name.equals(detail.getStore())) {
                iter.remove();
            }
        }
        return retval;
    }

    /**
     * @return 0-based position with given quantity and price.
     */
    public static int getPosition(int quantity, BigDecimal price, List<PriceDetail> details) throws Exception {
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

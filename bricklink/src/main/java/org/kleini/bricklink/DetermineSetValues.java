/*
 * GPL v3
 */

package org.kleini.bricklink;

import static java.math.RoundingMode.HALF_UP;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.bricklink.selenium.catalog.NoSuchPartException;
import org.kleini.bricklink.selenium.data.PartOutData;
import org.kleini.lego.LEGOShopSelenium;
import org.kleini.lego.Set;

/**
 *
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class DetermineSetValues {

    public DetermineSetValues() {
        super();
    }

    public static void main(String[] args) throws Exception {
        List<Set> sets;
        try (
            LEGOShopSelenium shopSelenium = new LEGOShopSelenium();
        ) {
            sets = shopSelenium.getAvailableSets();
        }
        System.out.println("Number of sets: " + sets.size());
        Configuration configuration = new Configuration();
        List<Margin> output = new ArrayList<Margin>();
        try (
            BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        ) {
            int i = 1;
            for (Set set : sets) {
                String itemId = Integer.toString(set.getIdentifier());
                BigDecimal value = BigDecimal.ZERO;
                PartOutData data = null;
                try {
                    data = selenium.getPartOutValue(new ItemType[] { ItemType.SET, ItemType.GEAR }, itemId);
                    value = data.getValue();
                } catch (NoSuchPartException e) {
                    System.err.println("Can not get part out value for set/gear " + itemId + '.');
                } catch (Exception e) {
                    e.printStackTrace();
                }
                Margin marge = new Margin(set);
                marge.setPartOutValue(value);
                output.add(marge);
                System.out.println((100*i++/sets.size()) + "% " + marge.toString());
                if (null == data) {
                    continue;
                }
                try {
                    Date date = selenium.getInventoryCreateDate(data.getType(), itemId);
                    marge.setInventoried(date);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        output.sort(new Comparator<Margin>() {
            @Override
            public int compare(Margin o1, Margin o2) {
                return o2.getMarge().compareTo(o1.getMarge());
            }
        });
        try (
            FileOutputStream fos = new FileOutputStream(new File(args[0]));
            OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
        ) {
            for (Margin marge : output) {
                osw.write(marge.toString());
                osw.write(System.lineSeparator());
            }
        }
    }

    private static final BigDecimal HUNDRED = new BigDecimal("100");

    private static final class Margin {
        private final Set set;
        private BigDecimal partOutValue;
        private BigDecimal marge;
        private Date inventoried;
        Margin(Set set) {
            super();
            this.set = set;
        }
        void setPartOutValue(BigDecimal value) {
            this.partOutValue = value;
            try {
                this.marge = HUNDRED.multiply(partOutValue.divide(set.getRetailPrice(), HALF_UP)).subtract(HUNDRED);
            } catch (ArithmeticException e) {
                this.marge = new BigDecimal("0");
            }
        }
        BigDecimal getMarge() {
            return marge;
        }
        void setInventoried(Date inventoried) {
            this.inventoried = inventoried;
        }
        @Override
        public String toString() {
            String retval = "" + set.getIdentifier() + " " + set.getName() + " " + set.getRetailPrice() + " " + partOutValue + " " + marge;
            if (null != inventoried) {
                if (((System.currentTimeMillis() - inventoried.getTime()) / 1000 / 60 / 60 / 24) < 100) {
                    retval += " very young, inventoried on " + new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(inventoried);
                }
            }
            return retval;
        }
    }
}

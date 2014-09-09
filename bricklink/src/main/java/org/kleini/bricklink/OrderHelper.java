/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.kleini.bricklink.data.Order;

/**
 * Helper methods for orders.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class OrderHelper {

    private final Pattern commentPattern;

    public OrderHelper(String commentRegex) {
        super();
        this.commentPattern = Pattern.compile(commentRegex);
    }

    public boolean isNotBilled(Order order) throws Exception {
        String remarks = order.getRemarks();
        if (null == remarks || remarks.length() == 0) {
            return true;
        }
        Matcher matcher = commentPattern.matcher(remarks);
        final boolean retval;
        if (matcher.matches()) {
            String billingNumber = matcher.group("billed");
            if (null == billingNumber) {
                throw new Exception("Can not extract billing number from order remarks \"" + remarks + "\".");
            }
            retval = 0 == billingNumber.length();
        } else {
            throw new Exception("Order remarks regular expression does not match on \"" + remarks + "\".");
        }
        return retval;
    }
}

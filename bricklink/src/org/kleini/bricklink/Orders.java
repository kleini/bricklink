/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Helper methods for orders.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Orders {

    private final Pattern commentPattern;

    public Orders(String commentRegex) {
        super();
        this.commentPattern = Pattern.compile(commentRegex);
    }

    public List<Integer> extractNotBilled(Map<Integer, String> comments) {
        List<Integer> retval = new ArrayList<Integer>();
        for (Entry<Integer, String> entry : comments.entrySet()) {
            String value = entry.getValue();
            Matcher matcher = commentPattern.matcher(value);
            if (matcher.matches()) {
                String billingNumber = matcher.group("billed");
                if (null != billingNumber && 0 == billingNumber.length()) {
                    retval.add(entry.getKey());
                }
            } else {
                System.err.println("Comment regex does not match on \"" + value + "\".");
            }
        }
        return retval;
    }
}

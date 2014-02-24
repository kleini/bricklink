/*
 * GPLv3
 */

package org.kleini.bricklink.data;

/**
 * {@link GuideType}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum GuideType {

    SOLD("sold"),
    STOCK("stock");

    private final String paramValue;

    private GuideType(String paramValue) {
        this.paramValue = paramValue;
    }

    public String getParamValue() {
        return paramValue;
    }
}
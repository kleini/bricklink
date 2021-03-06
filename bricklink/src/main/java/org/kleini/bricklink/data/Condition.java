/*
 * GPLv3
 */

package org.kleini.bricklink.data;

/**
 * {@link Condition} Indicates whether the price guide is for new or used
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum Condition {

    N,
    U;

    @Override
    public String toString() {
        switch (this) {
        case N:
            return "New";
        case U:
            return "Used";
        }
        return super.toString();
    }
}

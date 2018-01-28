/*
 * GPLv3
 */

package org.kleini.bricklink.data;

/**
 * {@link AppearAs}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public enum AppearAs {

    A("Alternate"),
    C("Counterpart"),
    E("Extra"),
    R("Regular");

    private String name;

    private AppearAs(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

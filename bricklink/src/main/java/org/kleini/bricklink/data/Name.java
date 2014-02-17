/*
 * GPL v3
 */

package org.kleini.bricklink.data;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Name}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Name {

    /**
     * The full name of this person, including middle names, suffixes, etc.
     */
    private String full;

    public Name() {
        super();
    }

    @JsonProperty("full")
    public String getFull() {
        return full;
    }

    @JsonProperty("full")
    public void setFull(String full) {
        this.full = full;
    }
}

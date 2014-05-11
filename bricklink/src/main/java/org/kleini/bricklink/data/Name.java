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

    /**
     * The given name (first name) of this person.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String first;

    /**
     * The family name (last name) of this person.
     * It is provided only if a buyer updated his/her address and name as a normalized form.
     */
    private String last;

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

    @JsonProperty("first")
    public String getFirst() {
        return first;
    }

    @JsonProperty("first")
    public void setFirst(String first) {
        this.first = first;
    }

    @JsonProperty("last")
    public String getLast() {
        return last;
    }

    @JsonProperty("last")
    public void setLast(String last) {
        this.last = last;
    }
}

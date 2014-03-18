/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Subset}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class Subset {

    /**
     * A identification number given to a matching group that consists of regular items and alternate items.
     * 0 if there is no matching of alternative item
     */
    private int identifier;

    /**
     * A list of the items included in the specified item
     */
    private List<Entry> entries;

    public Subset() {
        super();
    }

    @JsonProperty("match_no")
    public int getIdentifier() {
        return identifier;
    }

    @JsonProperty("match_no")
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("entries")
    public List<Entry> getEntries() {
        return entries;
    }

    @JsonProperty("entries")
    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(entries);
        if (0 != identifier) {
            sb.append(',');
            sb.append(identifier);
        }
        return sb.toString();
    }
}

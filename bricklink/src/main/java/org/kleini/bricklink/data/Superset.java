/*
 * GPLv3
 */

package org.kleini.bricklink.data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Superset}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Superset {

    private Color color;
    private List<SupersetEntry> entries;

    public Superset() {
        super();
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @JsonProperty("color_id")
    public void setColorID(int colorId) throws Exception {
        this.color = Color.byId(colorId);
    }

    @JsonProperty("entries")
    public List<SupersetEntry> getEntries() {
        return entries;
    }

    @JsonProperty("entries")
    public void setEntries(List<SupersetEntry> entries) {
        this.entries = entries;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(color);
        sb.append(':');
        sb.append(entries);
        return sb.toString();
    }
}

/*
 * GPL v3
 */

package org.kleini.brickscout.data;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link Response}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"pageMetadata","_embedded","_links"})
public class Response<T> {

    private List<T> representations;

    public Response() {
        super();
    }

    @JsonProperty("representations")
    public List<T> getRepresentations() {
        return representations;
    }

    @JsonProperty("representations")
    public void setRepresentations(List<T> representations) {
        this.representations = representations;
    }
}

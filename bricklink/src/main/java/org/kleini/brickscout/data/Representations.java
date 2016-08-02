/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ShopProducts}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Representations<T> extends PagedResources<T> {

    private List<T> representations;

    public Representations() {
        this(new ArrayList<T>(), null);
    }

    public Representations(Collection<T> content, PageMetadata metadata, Link... links) {
        super(content, metadata, links);
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

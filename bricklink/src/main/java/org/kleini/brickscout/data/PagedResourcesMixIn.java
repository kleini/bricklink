/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.List;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.PagedResources.PageMetadata;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link PagedResourcesMixIn}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"_embedded","_links"})
public abstract class PagedResourcesMixIn {

    @JsonProperty("pageMetadata")
    abstract PageMetadata getMetadata();

    @JsonProperty("_links")
    abstract List<Link> getLinks();
}

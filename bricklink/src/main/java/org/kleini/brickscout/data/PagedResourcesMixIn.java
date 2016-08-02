/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import org.springframework.hateoas.PagedResources.PageMetadata;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link PagedResourcesMixIn}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class PagedResourcesMixIn {

    @JsonProperty("pageMetadata")
    abstract PageMetadata getMetadata();

}

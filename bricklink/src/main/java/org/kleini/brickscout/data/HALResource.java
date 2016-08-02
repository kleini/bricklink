/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.HashMap;
import java.util.Map;
import org.springframework.hateoas.ResourceSupport;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link HALResource}
 *
 * @author <a href="mailto:marcus.klein@open-xchange.com">Marcus Klein</a>
 */
public abstract class HALResource extends ResourceSupport {

    private final Map<String, ResourceSupport> embedded = new HashMap<String, ResourceSupport>();

    protected HALResource() {
        super();
    }

    @JsonInclude(Include.NON_EMPTY)
    @JsonProperty("_embedded")
    public Map<String, ResourceSupport> getEmbeddedResources() {
        return embedded;
    }

    public void embedResource(String relationship, ResourceSupport resource) {
        embedded.put(relationship, resource);
    }
}

/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * {@link ResourcesMixIn}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class ResourcesMixIn<T> {

    @JsonProperty("representations")
    abstract Collection<T> getContent();
}

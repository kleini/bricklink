/*
 * GPLv3
 */

package org.kleini.brickscout.data;

import org.springframework.hateoas.Resources;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * {@link Image}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
@JsonIgnoreProperties({"alt","contentType","imageUUID","longdesc","ordering","uploadUrl","type"})
public class Image extends Resources {

    public Image() {
        super();
    }

}

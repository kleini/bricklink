/*
 * GPL v3
 */

package org.kleini.bricklink.api;

import org.kleini.api.Parser;

/**
 * {@link MetaParser}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public abstract class MetaParser<T extends MetaResponse<?>, U> extends Parser<T, org.kleini.bricklink.data.Response<U>> {
    // Nothing to do.
}
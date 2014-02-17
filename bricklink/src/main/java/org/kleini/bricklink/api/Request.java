/*
 * GPL v3
 */

package org.kleini.bricklink.api;

/**
 * {@link Request}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public interface Request<T extends Response<?>> {

    String getPath();

    Parameter[] getParameters();

    Parser<? extends T, ?> getParser();
}

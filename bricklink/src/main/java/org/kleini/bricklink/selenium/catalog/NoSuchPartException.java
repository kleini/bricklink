/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.catalog;

/**
 * Indicates, that some part could not be found in the catalog.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class NoSuchPartException extends Exception {

    private static final long serialVersionUID = 3506922938942020987L;

    public NoSuchPartException() {
        super();
    }

    public NoSuchPartException(String message) {
        super(message);
    }

    public NoSuchPartException(Throwable cause) {
        super(cause);
    }

    public NoSuchPartException(String message, Throwable cause) {
        super(message, cause);
    }
}

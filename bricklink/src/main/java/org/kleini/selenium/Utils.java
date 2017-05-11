/*
 * GPL v3
 */

package org.kleini.selenium;

import java.util.concurrent.Callable;
import org.openqa.selenium.WebElement;

/**
 * {@link Utils}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Utils {

    private Utils() {
        super();
    }

    public static void tenaciousClick(WebElement element) throws Exception {
        retry(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                element.click();
                return null;
            }
        }, new Exception("Element " + element + " could not be clicked even after 10 tries."));
    }

    public static <V> V retry(Callable<V> callable) throws Exception {
        return retry(callable, new Exception("Method " + callable + " did not work even after 10 tries."));
    }

    public static <V> V retry(Callable<V> callable, Exception e) throws Exception {
        int tries = 10;
        Exception toThrow = e;
        do {
            try {
                return callable.call();
            } catch (Exception e1) {
                if (null == toThrow) {
                    toThrow = e1;
                }
                tries--;
                Thread.sleep(200);
            }
        } while (tries > 0);
        throw toThrow;
    }
}

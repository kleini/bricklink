/*
 * GPL v3
 */

package org.kleini.selenium;

import java.util.concurrent.Callable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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

    public static boolean tenaciousClick(WebElement element) throws Exception {
        return retry(new Callable<Boolean>() {
            @Override
            public Boolean call() throws Exception {
                try {
                    element.click();
                    return true;
                } catch (Exception e) {
                    e.printStackTrace(System.out);
                    throw e;
                }
            }
        }, new Exception("Element " + element + " could not be clicked even after 10 tries."));
    }

    public static <V> V retry(Callable<V> callable) throws Exception {
        return retry(callable, new Exception("Method " + callable + " did not work even after 10 tries."));
    }

    public static <V> V retry(Callable<V> callable, Exception e) throws Exception {
        int tries = 10;
        Exception toThrow = e;
        while (tries > 0) {
            try {
                return callable.call();
            } catch (Exception e1) {
                e1.printStackTrace(System.out);
                if (null == toThrow) {
                    toThrow = e1;
                } else if (null == toThrow.getCause()) {
                    toThrow.initCause(e1);
                }
                tries--;
                Thread.sleep(200);
            }
        }
        throw toThrow;
    }

    public static WebElement scrollTo(WebDriver driver, WebElement e) throws Exception {
        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView(false);", e);
            Thread.sleep(200);
            return e;
        }
        throw new Exception("WebDriver is no Javascript executor.");
    }
}

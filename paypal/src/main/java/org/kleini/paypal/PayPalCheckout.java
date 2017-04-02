/*
 * GPLv3
 */

package org.kleini.paypal;

import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * {@link PayPalCheckout} Performs a checkout on the paypal site.
 *
 * @author <a href="himself@kleini.org">Marcus Klein</a>
 */
public final class PayPalCheckout {

    private final WebDriver driver;

    public PayPalCheckout() {
        this(createDriver());
    }

    private static WebDriver createDriver() {
        String browser = System.getProperty("browser");
        WebDriver driver;
        if ("phantom".equals(browser)) {
//            DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
//            capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS, "--logLevel=DEBUG");
//            capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] {"--ssl-protocol=tlsv1"});
//            driver = new PhantomJSDriver(capabilities);
            driver = new PhantomJSDriver();
        } else {
            driver = new ChromeDriver();
            driver.manage().window().setSize(new Dimension(900, 830));
        }
        return driver;
    }

    public PayPalCheckout(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void checkoutURL(String url, String login, String password) throws Exception {
        driver.get(url);
        String host = new URL(url).getHost();
        try {
            checkoutInternal(login, password, host);
        } finally {
            driver.close();
        }
    }

    public void checkoutInternal(String login, String password, String host) throws Exception {
        new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));
        // Login in iframe
        String lastHandle = driver.getWindowHandle();
        WebElement iframe = driver.findElement(By.cssSelector("iframe[name=injectedUl]"));
        driver.switchTo().frame(iframe);
        try {
            WebElement emailInput = driver.findElement(By.id("email"));
            emailInput.clear();
            emailInput.sendKeys(login);
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.clear();
            passwordInput.sendKeys(password);
            driver.findElement(By.id("btnLogin")).click();
        } finally {
            driver.switchTo().window(lastHandle);
        }
        try {
            WebElement error = new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.id("pageLevelErrors")));
            if (error.isDisplayed()) {
                throw new Exception("Login failed.");
            }
        } catch (TimeoutException e) {
            // Good if the error was not displayed
        }
        WebElement confirmButton = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("confirmButtonTop")));
        new WebDriverWait(driver, 5).until(ExpectedConditions.invisibilityOfElementLocated(By.id("spinner")));
        confirmButton.click();
        do {
            Thread.sleep(100);
        } while (driver.getCurrentUrl().contains(host));
    }
}

/*
 * GPLv3
 */

package org.kleini.paypal;

import java.net.URL;
import java.util.concurrent.TimeUnit;
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
        new WebDriverWait(driver, 20).pollingEvery(0, TimeUnit.MILLISECONDS).until(ExpectedConditions.visibilityOfElementLocated(By.id("preloaderSpinner")));
        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloaderSpinner")));
        while (true) {
            try {
                new WebDriverWait(driver, 1).until(ExpectedConditions.numberOfElementsToBe(By.id("btnLogin"), Integer.valueOf(1)));
                break;
            } catch (TimeoutException e) {
                // No login button. Is this the pre page? 
                if (!driver.findElements(By.xpath("//a[contains(text(),'Einloggen')]")).isEmpty()) {
                    WebElement loginButton = driver.findElement(By.xpath("//a[contains(text(),'Einloggen')]"));
                    loginButton.click();
                    // Spinner is first not available at all in DOM. It appears only for very few milliseconds.
                    new WebDriverWait(driver, 5).pollingEvery(0, TimeUnit.MILLISECONDS).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.id("spinner"), Integer.valueOf(0)));
                    // Is suddenly there and visible and then removed 
                    new WebDriverWait(driver, 5).until(ExpectedConditions.numberOfElementsToBe(By.id("spinner"), Integer.valueOf(0)));
                } else {
                    System.out.println("I am stuck. Please check current page.");
                    Thread.sleep(20000);
                    throw new Exception("PayPalCheckout is stuck.");
                }
            }
        }
        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.clear();
        emailInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.clear();
        passwordInput.sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

        System.out.println("Check error");
        new WebDriverWait(driver, 20).pollingEvery(0, TimeUnit.MILLISECONDS).until(ExpectedConditions.or(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p.notification.notification-critical")),
                ExpectedConditions.visibilityOfElementLocated(By.id("preloaderSpinner"))));
        if (!driver.findElements(By.cssSelector("p.notification.notification-critical")).isEmpty()) {
            throw new Exception("Login failed.");
        }
        System.out.println("Second after login");
        new WebDriverWait(driver, 20).until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloaderSpinner")));

        WebElement confirmButton = new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("confirmButtonTop")));
//        System.out.println("" + confirmButton.isDisplayed());
//        System.exit(0);
        confirmButton.click();
        do {
            Thread.sleep(100);
        } while (driver.getCurrentUrl().contains(host));
    }
}

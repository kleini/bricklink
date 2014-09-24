/*
 * GPL v3
 */

package org.kleini.efiliale;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

import org.kleini.bricklink.data.Order;
import org.kleini.efiliale.data.Stamp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class EFilialeSelenium {

    private static final String URL = "https://www.efiliale.de";

    private final WebDriver driver;

    private final LoginPage loginPage;

    public EFilialeSelenium(String login, String password) throws Exception {
        super();
        driver = new FirefoxDriver();
        driver.get(URL);
        loginPage = new LoginPage(driver);
        loginPage.login(login, password);
    }

    public void close() {
        loginPage.logout();
        driver.quit();
    }

    public void process(Map<Stamp, Order> stampMap) throws Exception {
        Map<Stamp, Order> letterMap = new EnumMap<Stamp, Order>(Stamp.class);
        Map<Stamp, Order> parcelMap = new EnumMap<Stamp, Order>(Stamp.class);
        for (Entry<Stamp, Order> entry : stampMap.entrySet()) {
            switch (entry.getKey().getType()) {
            case LETTER:
                letterMap.put(entry.getKey(), entry.getValue());
                break;
            case PARCEL:
                parcelMap.put(entry.getKey(), entry.getValue());
                break;
            default:
                throw new Exception("Don't know how to create stamps for " + entry.getKey());
            }
        }
        LetterPage letterPage = new LetterPage(driver);
        letterPage.process(letterMap);
        // TODO parcels
        WebElement toShoppingCartLink = driver.findElement(By.xpath("//span[text()='zur Kasse']"));
        toShoppingCartLink.click();
        // //input[@type='text' and @maxlength='50'] for order ids
    }
}

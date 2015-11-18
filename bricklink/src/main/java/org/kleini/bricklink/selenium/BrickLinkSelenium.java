/*
 * GPLv3
 */

package org.kleini.bricklink.selenium;

import static org.kleini.bricklink.api.ConfigurationProperty.LOGIN;
import static org.kleini.bricklink.api.ConfigurationProperty.PASSWORD;

import java.util.List;
import java.util.Set;

import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.bricklink.selenium.catalog.PriceGuidePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

/**
 * {@link BrickLinkSelenium}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickLinkSelenium {

    private static final String URL = "https://www.bricklink.com";

    private final WebDriver driver;

    private final LoginPage loginPage;

    public BrickLinkSelenium(String login, String password) throws Exception {
        super();
        driver = new FirefoxDriver();
//        driver = new PhantomJSDriver();
//        driver = new ChromeDriver();
        driver.get(URL);
        loginPage = new LoginPage(driver);
        loginPage.login(login, password);
    }

    public BrickLinkSelenium(Configuration configuration) throws Exception {
        this(configuration.getProperty(LOGIN), configuration.getProperty(PASSWORD));
    }

    public void close() {
        loginPage.logout();
        driver.quit();
    }

    public PriceGuide getPriceGuide(ItemType itemType, String itemID, int colorID, GuideType sold, Condition condition, boolean details) throws Exception {
        return new PriceGuidePage(driver).getPriceGuide(itemType, itemID, colorID, sold, condition, details);
    }

    public void openPriceGuideTab(String itemId, int colorId) throws Exception {
//        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//        String newTab = driver.getWindowHandles().iterator().next();
//        driver.switchTo().window(newTab);
//        driver.get("https://www.bricklink.com/catalogPG.asp?P=" + itemId + "&colorID=" + colorId);
        if (driver instanceof JavascriptExecutor) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.open('https://www.bricklink.com/catalogPG.asp?P=" + itemId + "&colorID=" + colorId + "','_blank');");
            js.executeScript("keyDown(Keys.CONTROL).keyDown('t').keyUp('t').keyUp(Keys.CONTROL);");
            String newTab = driver.getWindowHandles().iterator().next();
            driver.switchTo().window(newTab);
            driver.get("https://www.bricklink.com/catalogPG.asp?P=" + itemId + "&colorID=" + colorId);
        } else {
            throw new Exception("Can not execute JavaScript.");
        }
    }
}

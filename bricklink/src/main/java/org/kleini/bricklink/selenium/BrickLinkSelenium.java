/*
 * GPLv3
 */

package org.kleini.bricklink.selenium;

import static org.kleini.bricklink.api.ConfigurationProperty.LOGIN;
import static org.kleini.bricklink.api.ConfigurationProperty.PASSWORD;

import java.util.List;

import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.data.Category;
import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.Condition;
import org.kleini.bricklink.data.GuideType;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.data.PriceGuide;
import org.kleini.bricklink.selenium.catalog.CategoryListPage;
import org.kleini.bricklink.selenium.catalog.NoSuchPartException;
import org.kleini.bricklink.selenium.catalog.PartOutPage;
import org.kleini.bricklink.selenium.catalog.PriceGuidePage;
import org.kleini.bricklink.selenium.data.PartOutData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

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
        String browser = System.getProperty("browser");
        if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        } else {
            DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
            capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_GHOSTDRIVER_CLI_ARGS, "--logLevel=DEBUG");
            driver = new PhantomJSDriver(capabilities);
        }
        driver.get(URL);
        loginPage = new LoginPage(driver, login);
        loginPage.login(password);
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

    public WebDriver getDriver() {
        return driver;
    }

    public PartOutData getPartOutValue(ItemType[] types, String itemId) throws Exception {
        PartOutPage page = new PartOutPage(driver);
        for (ItemType type : types) {
            try {
                PartOutData data = page.getPartOutValue(type, itemId);
                return data;
            } catch (NoSuchPartException e) {
                // Try with next ItemType again
            }
        }
        throw new NoSuchPartException("Can not get part out value for " + itemId);
    }

    public List<String> getCategoryParts(Category category) throws Exception {
        return new CategoryListPage(driver).getPartList(category);
    }

    public Color guessColor(ItemType type, String itemId) throws Exception {
        return new CatalogItemPage(driver).guessColor(type, itemId);
    }
}

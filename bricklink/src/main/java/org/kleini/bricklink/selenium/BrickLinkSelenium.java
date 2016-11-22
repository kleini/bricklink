/*
 * GPLv3
 */

package org.kleini.bricklink.selenium;

import static org.kleini.bricklink.api.ConfigurationProperty.LOGIN;
import static org.kleini.bricklink.api.ConfigurationProperty.PASSWORD;
import java.io.Closeable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * {@link BrickLinkSelenium}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class BrickLinkSelenium implements Closeable {

    public static final String URL = "https://www.bricklink.com";

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
            capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] {"--ssl-protocol=tlsv1"});
            driver = new PhantomJSDriver(capabilities);
        }
        loginPage = new LoginPage(driver, login);
        loginPage.login(password);
    }

    public BrickLinkSelenium(Configuration configuration) throws Exception {
        this(configuration.getProperty(LOGIN), configuration.getProperty(PASSWORD));
    }

    @Override
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

    private static final Pattern pattern = Pattern.compile("inventoried this \\w+ on (\\w{3} \\d{1,2}, \\d{4})");

    public Date getInventoryCreateDate(ItemType type, String itemId) {
        driver.get(URL + "/catalogItemInv.asp?" + type.getId() + "=" + itemId + (ItemType.GEAR.equals(type) ? "" : "-1"));
        Date retval = null;
        try {
            WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//font[text()[contains(.,'inventoried')]]")));
            Matcher matcher = pattern.matcher(element.getText());
            if (matcher.find()) {
                String dateText = matcher.group(1);
                SimpleDateFormat df = new SimpleDateFormat("MMM dd, yyyy", Locale.US);
                retval = df.parse(dateText);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return retval;
    }
}

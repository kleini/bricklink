package org.kleini.lego;

import java.io.Closeable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * set nummer span[class='item-code']
 *
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LEGOShopSelenium implements Closeable {

    private static final String URL = "https://shop.lego.com/de-DE/catalog/productListing.jsp";

    private final WebDriver driver;

    public LEGOShopSelenium() {
        super();
        String browser = System.getProperty("browser");
        if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("chrome".equals(browser)) {
            driver = new ChromeDriver();
        } else {
            DesiredCapabilities capabilities = DesiredCapabilities.phantomjs();
            // --webdriver-loglevel=DEBUG
            capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_CLI_ARGS, new String[] { "--ssl-protocol=any" });
            PhantomJSDriver phantom = new PhantomJSDriver(capabilities);
            driver = phantom;
        }
    }

    @Override
    public void close() {
        driver.close();
    }

    private static final Pattern pattern = Pattern.compile("([\\d\\,]+) €");

    public List<Set> getAvailableSets() {
        driver.get(URL);
        driver.findElement(By.id("pagination-9999")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("ul[id='product-results'] > li"));
        List<Set> retval = new LinkedList<Set>();
        for (WebElement element : elements) {
            WebElement setNummerE = element.findElement(By.cssSelector("span[class='item-code']"));
            int setNummer = Integer.parseInt(setNummerE.getText());
            Set set = new Set(setNummer);

            WebElement linkWithName = element.findElement(By.cssSelector("h4 > a"));
            String name = linkWithName.getAttribute("title");
            set.setName(name);

            WebElement priceElement;
            try {
                priceElement = element.findElement(By.cssSelector("ul > li > em"));
            } catch (NoSuchElementException e) {
                System.out.println("No retail price for Set " + setNummer);
                continue;
            }
            String toParse = priceElement.getText();
            Matcher matcher = pattern.matcher(toParse);
            if (matcher.matches()) {
                String value = matcher.group(1).replace(',', '.');
                set.setRetailPrice(new BigDecimal(value));
            }
            retval.add(set);
        }
        return retval;
    }
}

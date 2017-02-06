package org.kleini.lego;

import java.io.Closeable;
import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
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

    private static final String URL = "https://shop.lego.com/de-DE/Creator-Sets?S1=&count=18&do=json-db&showRetired=false&page=1";

    private final WebDriver driver;

    public LEGOShopSelenium() {
        super();
        String browser = System.getProperty("browser");
        if ("firefox".equals(browser)) {
            driver = new FirefoxDriver();
        } else if ("marionette".equals(browser)) {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxDriver.MARIONETTE, Boolean.TRUE);
            driver = new FirefoxDriver(capabilities);
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
        List<Set> retval = new LinkedList<Set>();
        WebElement nextPageLink = null;
        int lastSetNumber = 0;
        do {
            boolean found = false;
            do {
                found = false;
                List<WebElement> elements = driver.findElements(By.cssSelector("div[data-test='product-leaf-group'] > div:last-of-type[data-test^='product-leaf-'] > div > span[data-test='product-leaf-id']"));
                try {
                    for (WebElement element : elements) {
                        if (lastSetNumber == Integer.parseInt(element.getText())) {
                            found = true;
                        }
                    }
                } catch (StaleElementReferenceException e) {
                    found = true;
                }
            } while (found);
            WebElement indexE = driver.findElement(By.cssSelector("div[data-test='pagination']"));
            String text = indexE.getText().replaceAll("\n", "").replaceAll("WEITER", "").replaceAll("ZUR\u00DCCK", "");
            System.out.println(text);
            List<Set> setsFromPage = readSetsFromPage();
            lastSetNumber = setsFromPage.get(setsFromPage.size() - 1).getIdentifier();
            retval.addAll(setsFromPage);
            try {
                nextPageLink = driver.findElement(By.cssSelector("a[class='pagination__next']"));
            } catch (NoSuchElementException e) {
                nextPageLink = null;
            }
            if (null != nextPageLink) {
                nextPageLink.click();
            }
        } while (null != nextPageLink);
        return retval;
    }

    private List<Set> readSetsFromPage() {
        List<Set> retval = new LinkedList<Set>();
        List<WebElement> products = driver.findElements(By.cssSelector("div[data-test='product-leaf-group'] > div[data-test^='product-leaf-']"));
        for (WebElement product : products) {
            WebElement setNummerE = product.findElement(By.cssSelector("div > span[data-test='product-leaf-id']"));
            int setNummer = Integer.parseInt(setNummerE.getText());
            Set set = new Set(setNummer);

            WebElement spanWithName = product.findElement(By.cssSelector("div > h2[data-test='product-leaf-title'] > a[data-test='product-leaf-link-title'] > span"));
            String name = spanWithName.getText();
            set.setName(name);

            final WebElement priceElement;
            List<WebElement> saleElements = product.findElements(By.cssSelector("div > div[data-test='product-leaf-pricing'] > div > div[data-test='sale-price'] > span[data-test='formatted-value']"));
            List<WebElement> elements = product.findElements(By.cssSelector("div > div[data-test='product-leaf-pricing'] > div > div[data-test='list-price'] > span[data-test='list-pricing']"));
            if (!saleElements.isEmpty()) {
                priceElement = saleElements.get(0);
            } else if (!elements.isEmpty()) {
                priceElement = elements.get(0);
            } else {
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

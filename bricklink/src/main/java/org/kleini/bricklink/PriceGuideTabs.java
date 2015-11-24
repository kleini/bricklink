/*
 * GPL v3
 */

package org.kleini.bricklink;

import static org.kleini.bricklink.api.ConfigurationProperty.LOGIN;
import java.io.File;
import org.kleini.bricklink.api.Configuration;
import org.kleini.bricklink.selenium.BrickLinkSelenium;
import org.kleini.brickstore.BrickStoreDeSerializer;
import org.kleini.brickstore.data.BrickStoreXML;
import org.kleini.brickstore.data.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/**
 * Opens all parts of a BrickStore file in browser tabs.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class PriceGuideTabs {

    public PriceGuideTabs() {
        super();
    }

    public static void main(String[] args) throws Exception {
        int numTabs = Integer.parseInt(System.getProperty("numTabs", "10"));
        BrickStoreDeSerializer deSerializer = new BrickStoreDeSerializer();
        File file = new File(args[0]);
        final BrickStoreXML brickStore = deSerializer.load(file);
        Configuration configuration = new Configuration();
        BrickLinkSelenium selenium = new BrickLinkSelenium(configuration);
        WebElement logoff = null;
        WebDriver driver = selenium.getDriver();
        try {
            int count = 0;
            for (Item item : brickStore.getInventory().getItem()) {
                String url = "https://www.bricklink.com/catalogItem.asp?" + item.getItemTypeID() + '=' + item.getItemID();
                if (0 != item.getColorID()) {
                    url += "&idColor=" + item.getColorID();
                }
                driver.get(url);
                WebElement link = driver.findElement(By.id("_idShowPriceGuideLink"));
                Actions actions = new Actions(driver);
                actions.keyDown(Keys.CONTROL);
                actions.click(link);
                actions.keyUp(Keys.CONTROL);
                actions.perform();
                if (0 == (++count % numTabs)) {
                    do {
                        Thread.sleep(10000);
                        try {
                            logoff = driver.findElement(By.linkText("Logoff"));
                        } catch (NoSuchElementException e) {
                            // ignore
                        }
                    } while (null == logoff || !logoff.isDisplayed());
                    logoff = null;
                    driver.findElement(By.linkText(configuration.getProperty(LOGIN))).click();
                }
            }
            do {
                Thread.sleep(10000);
                try {
                    logoff = driver.findElement(By.linkText("Logoff"));
                } catch (NoSuchElementException e) {
                    //ignore
                }
            } while (null == logoff || !logoff.isDisplayed());
            logoff.click();
        } finally {
            if (null == logoff) {
                selenium.close();
            } else {
                driver.quit();
            }
        }
    }
}

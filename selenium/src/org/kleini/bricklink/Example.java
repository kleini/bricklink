/*
 * GPL v3
 */

package org.kleini.bricklink;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * This class is a starter and extracts customer addresses.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Example {

    public static void main(String[] args) throws InterruptedException {

        final String url = "https://www.bricklink.com";
//        FirefoxProfile profile = new FirefoxProfile();
//        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//        capabilities.setCapability(FirefoxDriver.PROFILE, prepareFirefox());
        final WebDriver driver = new FirefoxDriver();
        try {
            driver.get(url);

    /*
            // enter something into the search field
            element.sendKeys("server");

            // submit the form
            element.submit();

            // get all links as webelement
            final String xpathToBugIds = "//table[@class='bz_buglist']//tr[contains(@class,'bz_bugitem')]/td[contains(@class,'bz_id_column')]/a";
            List<WebElement> idElements = driver.findElements(By.xpath(xpathToBugIds));

            // and store the links as string
            Map<Integer, String> idToLinkMapping = new HashMap<Integer, String>();
            for (WebElement webElement : idElements) {
                idToLinkMapping.put(Integer.valueOf(webElement.getText()), webElement.getAttribute("href"));
            }

            // only for debugging to limit the loop
            int count = 0;

            // open all pages
            for (Integer integer : idToLinkMapping.keySet()) {
                if (count > 5) {
                    break;
                }
                driver.navigate().to(idToLinkMapping.get(integer));
                // print the page title
                System.out.println(driver.getTitle());
                count++;
            }
    */
        } finally {
            Thread.sleep(1000);
            driver.quit();
        }
    }
/*
    private static FirefoxProfile prepareFirefox() {
        // Generate new profile
        final FirefoxProfile fp = new FirefoxProfile();

        // Ignore rights prompt
        fp.setPreference("browser.rights.3.shown", true);

        // Ignore default browser check
        fp.setPreference("startup.homepage_welcome_url", "");

        // Ignoring plugin compatibility check
        fp.setPreference("extensions.checkCompatibility.9.0", false);
        fp.setPreference("extensions.checkCompatibility.8.0", false);
        fp.setPreference("extensions.checkCompatibility.7.0", false);
        fp.setPreference("extensions.checkCompatibility.6.0", false);
        fp.setPreference("extensions.checkCompatibility.5.0", false);
        fp.setPreference("extensions.checkCompatibility.4.0", false);

        fp.setEnableNativeEvents(true);
        return fp;
    }
*/
}

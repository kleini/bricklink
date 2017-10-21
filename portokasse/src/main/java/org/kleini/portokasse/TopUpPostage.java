/*
 * GPL v3
 */

package org.kleini.portokasse;

import static org.kleini.selenium.Utils.chromeClick;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import de.dpag.oneclickforapp.webservice.PartnerSignature;

/**
 * {@link TopUpPostage}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class TopUpPostage {

    private final WebDriver driver;

    public TopUpPostage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void execute(PartnerSignature partner, String userToken, BigDecimal amount) throws Exception {
        boolean failed = false;
        do {
            System.out.println("Next try");
            failed = false;
            driver.get("https://portokasse.deutschepost.de");

            // Use userToken, that we require for 1C4A to login into Portokasse
            StringBuilder html = new StringBuilder();
            html.append("<form id=myForm method=post action=https://portokasse.deutschepost.de/portokasse/marketplace/enter-app-payment>");
            html.append(createInput("PARTNER_ID", partner.getPartnerId()));
            html.append(createInput("PARTNER_SIGNATURE", getSignature(partner.getPartnerId(), partner.getTimestamp(), "http://kleini.org/success", "http://kleini.org/cancel", userToken, "1000", partner.getKey())));
            html.append(createInput("REQUEST_TIMESTAMP", partner.getTimestamp()));
            html.append(createInput("KEY_PHASE", Integer.toString(partner.getKeyPhase())));
            html.append(createInput("SUCCESS_URL", "http://kleini.org/success"));
            html.append(createInput("CANCEL_URL", "http://kleini.org/cancel"));
            html.append(createInput("USER_TOKEN", userToken));
            html.append(createInput("BALANCE", "1000"));
            html.append("<input type=submit name=METHOD value=mysubmitbutton>");
            html.append("</form>");
            String script = "var div = document.createElement('div'); div.innerHTML=\"" + html + "\"; document.body.appendChild(div); document.getElementById('myForm').submit();";

            ((JavascriptExecutor) driver).executeScript(script);
            try {
                new WebDriverWait(driver, 5).until(ExpectedConditions.numberOfElementsToBe(By.id("btnLogin"), Integer.valueOf(0)));
            } catch (TimeoutException e) {
                failed = true;
            }
        } while (failed);

        WebElement inputElement = new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='amount']")));
        inputElement.clear();
        inputElement.sendKeys(amount.setScale(2, RoundingMode.HALF_DOWN).toString().replace('.', ','));
        chromeClick(driver, driver.findElement(By.cssSelector("label[for='flap-radio-paypal']")));
        chromeClick(driver, driver.findElement(By.cssSelector("button[type='submit'][title='Aufladen']")));
        // Wait until the browser left the page of Portokasse before checking for PayPal stuff on the page.
        do {
            Thread.sleep(100);
        } while (driver.getCurrentUrl().contains("https://portokasse.deutschepost.de"));
    }

    private static String createInput(String name, String value) {
        return "<input type=hidden name=" + name + " value=" + value + ">";
    }

    private static String getSignature(String partnerId, String timestamp, String successUrl, String cancelUrl, String userToken, String balance, String key) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String complete = partnerId + "::" + timestamp + "::" + successUrl + "::" + cancelUrl + "::" + userToken + "::" + balance + "::" + key;
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] bytes = complete.getBytes("UTF-8");
        return new BigInteger(1, digest.digest(bytes)).toString(16).substring(0, 8);
    }
}

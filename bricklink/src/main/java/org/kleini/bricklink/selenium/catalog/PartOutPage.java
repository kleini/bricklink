/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.catalog;

import java.math.BigDecimal;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.kleini.bricklink.data.ItemType;
import org.kleini.bricklink.selenium.data.PartOutData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Read the part out value of sets.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class PartOutPage {

    private final WebDriver driver;

    public PartOutPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public PartOutData getPartOutValue(ItemType type, String itemId) throws NoSuchPartException, Exception {
        // TODO Fix hard coded itemSeq once something appears that has not sequence number 1
        driver.get("https://www.bricklink.com/catalogPOV.asp?itemType=" + type.getId() + "&itemNo=" + itemId + "&itemSeq=1&itemQty=1&breakType=M&itemCondition=N");
        List<WebElement> errorMessageElements = driver.findElements(By.cssSelector("td[bgcolor='#FF0000'] center"));
        if (!errorMessageElements.isEmpty() && errorMessageElements.get(0).getText().contains("There was a problem processing your request")) {
            throw new NoSuchPartException("Can not get website with part out value for item " + itemId + " as " + type + ".");
        }
        WebElement p = driver.findElement(By.xpath("//font[contains(text(),'Average of last 6 months Sales')]/.."));
        WebElement value = p.findElement(By.xpath("//b[contains(text(),'EUR')]"));
        String text = value.getText();
        Pattern pattern = Pattern.compile("EUR ([\\d\\.]+)");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return new PartOutData(new BigDecimal(matcher.group(1)), type);
        }
        throw new Exception("Can not extract part out value for item " + itemId + " as " + type + ".");
    }
}

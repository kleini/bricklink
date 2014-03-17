/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.orders;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.kleini.bricklink.selenium.members.Address;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;

/**
 * This class provides functions for the received orders page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Received {

    private static final String COMMENT_XPATH = "//input[@class='mFB']";

    private final WebDriver driver;

    public Received(WebDriver driver) {
        super();
        this.driver = driver;
        open();
    }

    private void open() {
        WebElement ordersTab = driver.findElement(By.linkText(" Orders "));
        ordersTab.click();
        WebElement receivedTab = driver.findElement(By.linkText("Received"));
        receivedTab.click();
    }

    public Map<Integer, String> readComments() throws Exception {
        List<WebElement> commentFields = driver.findElements(By.xpath(COMMENT_XPATH));
        Map<Integer, String> retval = new HashMap<Integer, String>();
        for (WebElement commentField : commentFields) {
            String name = commentField.getAttribute("name");
            Pattern pattern = Pattern.compile("nM(\\d{7})");
            Matcher matcher = pattern.matcher(name);
            final Integer orderId;
            if (matcher.matches()) {
                orderId = Integer.parseInt(matcher.group(1));
            } else {
                throw new Exception("Can not parse commentField input name \"" + name + "\".");
            }
            retval.put(orderId, commentField.getAttribute("value"));
        }
        return retval;
    }

    public org.kleini.bricklink.data.Address getAddress(Integer orderId) {
        WebElement memberInfoLink = driver.findElement(By.xpath("//tr/td/a[@name='" + orderId.toString() + "']/../..//a[@title='View Address']"));
        memberInfoLink.click();
        Address addressPage = new Address(driver);
        org.kleini.bricklink.data.Address retval = addressPage.getAddress();
        addressPage.goBack();
        return retval;
    }
}

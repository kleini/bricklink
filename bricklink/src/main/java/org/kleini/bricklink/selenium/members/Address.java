/*
 * GPL v3
 */

package org.kleini.bricklink.selenium.members;

import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.Name;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Data extraction methods for the member addresses page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Address {

    private WebDriver driver;

    public Address(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public org.kleini.bricklink.data.Address getAddress() {
        org.kleini.bricklink.data.Address retval = new org.kleini.bricklink.data.Address();
        String url = driver.getCurrentUrl();
//        retval.setName(url.substring(url.lastIndexOf('=') + 1));
        WebElement nameElement = driver.findElement(By.xpath("(//tr/td/font/b[text()='Name:']/../../../td/font)[2]"));
        Name name = new Name();
        name.setFull(nameElement.getText());
        retval.setName(name);
        WebElement addressElement = driver.findElement(By.xpath("(//tr/td/font/b[text()='Address:']/../../../td/font)[2]"));
        retval.setFull(addressElement.getText());
        WebElement countryElement = driver.findElement(By.xpath("(//tr/td/font/b[text()='Country:']/../../../td/font)[2]"));
        retval.setCountry(Country.valueOf(countryElement.getText()));
        WebElement emailElement = driver.findElement(By.xpath("(//tr/td/font/b[text()='E-mail:']/../../../td/font)[2]"));
//        retval.setEmail(emailElement.getText());
        WebElement lastLoggedInElement = driver.findElement(By.xpath("(//tr/td/font/b[text()='Last Logged In:']/../../../td/font)[2]"));
//      TODO parse date:  retval.setLastLoggedIn(lastLoggedInElement.getText());
        return retval;
    }

    public void goBack() {
        WebElement backButton = driver.findElement(By.xpath("//input[@value='Go Back']"));
        backButton.click();
    }
}

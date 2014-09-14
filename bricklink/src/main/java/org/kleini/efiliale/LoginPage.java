/*
 * GPL v3
 */

package org.kleini.efiliale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LoginPage {

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        super();
        this.driver = driver;
        open();
    }

    private void open() {
        WebElement loginLink = driver.findElement(By.id("ta_link_0003"));
        loginLink.click();
    }

    public void login(String login, String password) {
        // TODO Auto-generated method stub
        
    }

    public void logout() {
        // TODO Auto-generated method stub
        
    }
}

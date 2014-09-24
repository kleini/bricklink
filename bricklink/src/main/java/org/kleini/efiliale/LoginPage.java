/*
 * GPL v3
 */

package org.kleini.efiliale;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
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

    public void login(String login, String password) throws Exception {
        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("ta_btn_044"));
        loginButton.click();
        // Fail if the Logoff link does not appear.
        try {
            driver.findElement(By.linkText("Abmelden"));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        WebElement logoffLink = driver.findElement(By.linkText("Abmelden"));
        logoffLink.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

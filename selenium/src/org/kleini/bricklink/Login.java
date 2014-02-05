/*
 * GPL v3
 */

package org.kleini.bricklink;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class provides functions for the login page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class Login {

    private final WebDriver driver;

    public Login(WebDriver driver) {
        super();
        this.driver = driver;
        open();
    }

    private void open() {
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();
    }

    public void login(String login, String password) throws Exception {
        WebElement usernameInput = driver.findElement(By.id("frmUsername"));
        usernameInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("frmPassword"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='SUBMIT' and @value='Login to BrickLink']"));
        loginButton.click();
        // Fail if the Logoff link does not appear.
        try {
            driver.findElement(By.xpath("//b[text()='Welcome to MyBrickLink']"));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        WebElement logoffLink = driver.findElement(By.linkText("Logoff"));
        logoffLink.click();
    }
}

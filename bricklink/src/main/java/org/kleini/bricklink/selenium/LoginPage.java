/*
 * GPL v3
 */

package org.kleini.bricklink.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * This class provides functions for the login page.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LoginPage {

    private final WebDriver driver;
    private final String login;

    public LoginPage(WebDriver driver, String login) {
        super();
        this.driver = driver;
        this.login = login;
        open();
    }

    private void open() {
        driver.get("https://www.bricklink.com/v2/login.page");
    }

    public void login(String password) throws Exception {
        WebElement usernameInput = driver.findElement(By.id("frmUsername"));
        usernameInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("frmPassword"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("blbtnLogin"));
        loginButton.click();
        try {
            // Fail if the logout link does not appear.
            driver.findElement(By.id("idMyPageLogout"));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        driver.get("https://www.bricklink.com/my.asp");
        WebElement logoutLink = driver.findElement(By.id("idMyPageLogout"));
        logoutLink.click();
    }
}

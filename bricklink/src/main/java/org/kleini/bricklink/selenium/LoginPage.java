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

    public LoginPage(WebDriver driver) {
        super();
        this.driver = driver;
        open();
    }

    private void open() {
        WebElement loginLink = driver.findElement(By.linkText("Log in or Register"));
        loginLink.click();
    }

    public void login(String login, String password) throws Exception {
        WebElement usernameInput = driver.findElement(By.id("frmUsername"));
        usernameInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("frmPasswordTopNav"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='button' and @value='Log in to BrickLink']"));
        loginButton.click();
        // Fail if the Logoff link does not appear.
        try {
            driver.findElement(By.xpath("//b[text()='Welcome to MyBrickLink']"));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        driver.findElement(By.linkText("kleini")).click();
        driver.findElement(By.linkText("Logoff")).click();
    }
}

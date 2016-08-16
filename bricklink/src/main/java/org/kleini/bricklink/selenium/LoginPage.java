/*
 * GPL v3
 */

package org.kleini.bricklink.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebElement loginLink = driver.findElement(By.xpath("//button[contains(text(),'Log in or Register')]"));
        loginLink.click();
    }

    public void login(String password) throws Exception {
        WebElement usernameInput = driver.findElement(By.id("frmUsername"));
        usernameInput.sendKeys(login);
        WebElement passwordInput = driver.findElement(By.id("frmPassword"));
        passwordInput.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("blbtnLogin"));
        loginButton.click();
        // Fail if the button to "My BL" does not appear
        try {
            new WebDriverWait(driver, 2).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-href='/my.asp']")));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        WebElement myBlButton = driver.findElement(By.xpath("//button[@data-href='/my.asp']"));
        new Actions(driver).moveToElement(myBlButton).build().perform();
        WebElement logout = new WebDriverWait(driver, 2).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("blbtnLogout"))));
        logout.click();
    }
}

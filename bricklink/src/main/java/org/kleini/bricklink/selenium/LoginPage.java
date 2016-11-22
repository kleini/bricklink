/*
 * GPL v3
 */

package org.kleini.bricklink.selenium;

import static org.kleini.bricklink.selenium.BrickLinkSelenium.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        driver.get(URL + "/v2/login.page");
    }

    private WebElement selectDisplayed(List<WebElement> list) throws Exception {
        for (WebElement tmp : list) {
            if (tmp.isDisplayed()) {
                return tmp;
            }
        }
        throw new Exception("All elements are not displayed.");
    }

    public void login(String password) throws Exception {
        WebElement usernameInput = selectDisplayed(driver.findElements(By.id("frmUsername")));
        usernameInput.sendKeys(login);
        WebElement passwordInput = selectDisplayed(driver.findElements(By.id("frmPassword")));
        passwordInput.sendKeys(password);
        WebElement loginButton = selectDisplayed(driver.findElements(By.id("blbtnLogin")));
        loginButton.click();
        try {
            // Fail if the logout link does not appear.
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("idMyPageLogout")));
        } catch (NoSuchElementException e) {
            throw new Exception("Login failed. Please check credentials!");
        }
    }

    public void logout() {
        driver.get(URL + "/my.asp");
        WebElement logoutLink = driver.findElement(By.id("idMyPageLogout"));
        logoutLink.click();
    }
}

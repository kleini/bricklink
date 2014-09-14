/*
 * GPL v3
 */

package org.kleini.efiliale;

import org.kleini.efiliale.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class EFilialeSelenium {

    private static final String URL = "https://www.efiliale.de";

    private final WebDriver driver;

    private final LoginPage loginPage;

    public EFilialeSelenium(String login, String password) {
        super();
        driver = new FirefoxDriver();
        driver.get(URL);
        loginPage = new LoginPage(driver);
        loginPage.login(login, password);
    }

    public void close() {
        loginPage.logout();
    }
}

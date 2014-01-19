/*
 * GPL v3
 */

package org.kleini.bricklink;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.kleini.bricklink.data.Address;
import org.kleini.bricklink.pages.orders.Received;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * This class is a starter and extracts customer addresses.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class CVSExport {

    public static void main(String[] args) throws Exception {
        Configuration configuration = new Configuration();
        final String url = "https://www.bricklink.com";
        final WebDriver driver = new FirefoxDriver();
        List<Address> addresses = new ArrayList<Address>();
        try {
            driver.get(url);
            Login login = new Login(driver);
            login.login(configuration.getProperty(ConfigurationProperty.LOGIN), configuration.getProperty(ConfigurationProperty.PASSWORD));
            Received received = new Received(driver);
            Orders orders = new Orders(configuration.getProperty(ConfigurationProperty.COMMENT_REGEX));
            List<Integer> notBilled = orders.extractNotBilled(received.readComments());
            Collections.sort(notBilled);
            for (Integer orderId : notBilled) {
                Address address = received.getAddress(orderId);
                addresses.add(address);
            }
            login.logout();
        } finally {
            driver.quit();
        }
        for (Address address : addresses) {
            System.out.print(address.getUsername());
            System.out.print(',');
            System.out.print(address.getName());
            System.out.print(',');
            System.out.print(address.getAddress().replace('\n', ' ').replace(',', ' '));
            System.out.print(',');
            System.out.print(address.getCountry());
            System.out.print(',');
            System.out.print(address.getEmail());
            System.out.print('\n');
        }
    }
}

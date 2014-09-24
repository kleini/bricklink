/*
 * GPL v3
 */

package org.kleini.efiliale;

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

import org.kleini.bricklink.data.Address;
import org.kleini.bricklink.data.Country;
import org.kleini.bricklink.data.Order;
import org.kleini.efiliale.data.Domestic;
import org.kleini.efiliale.data.Stamp;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public class LetterPage {

    private WebDriver driver;

    public LetterPage(WebDriver driver) {
        super();
        this.driver = driver;
        open();
    }

    private void open() {
        WebElement printLink = driver.findElement(By.id("marken-drucken-default"));
        printLink.click();
    }

    public void process(Map<Stamp, Order> stampMap) throws Exception {
        boolean notFirst = false;
        for (Entry<Stamp, Order> entry : stampMap.entrySet()) {
            if (notFirst) {
                WebElement addStampButton = driver.findElement(By.xpath("//a[contains(text(),'Weitere') and contains(text(),'Marke') and contains(text(),'hinzufügen')]"));
                addStampButton.click();
            }
            Stamp stamp = entry.getKey();
            Order order = entry.getValue();
            selectStamp(stamp);
            addAddress(order);
            WebElement useStampButton = driver.findElement(By.xpath("//input[@type='submit' and @value[contains(.,'Marke') and contains(.,'bernehmen')]]"));
            useStampButton.click();
            notFirst = true;
        }
        WebElement addToShoppingCartButton = driver.findElement(By.xpath("//a[text()='In den Warenkorb']"));
        addToShoppingCartButton.click();
        WebElement startPageLink = driver.findElement(By.xpath("//span[text()='zur Startseite']"));
        startPageLink.click();
    }

    private void selectStamp(Stamp stamp) throws Exception {
        WebElement tab = driver.findElement(domesticTab.get(stamp.getDomestic()));
        tab.click();
        By stampBy = stampButton.get(stamp);
        if (null == stampBy) {
            throw new Exception("Don't know how to find stamp on page " + stamp);
        }
        WebElement button = driver.findElement(stampBy);
        button.click();
    }

    private void addAddress(Order order) {
        WebElement addressButton = null;
        do {
            try {
                addressButton = driver.findElement(By.xpath("//span[@class[contains(.,'im-address')]]/a"));
            } catch (NoSuchElementException e) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e1) {
                    System.out.println("Need to wait for address button");
                }
            }
        } while (null == addressButton);
        addressButton.click();
        WebElement addressFeldRadio = null;
        do {
            try {
                addressFeldRadio = driver.findElement(By.id("to-adresstyp-adressfeld-radios"));
            } catch (NoSuchElementException e) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e1) {
                    System.out.println("Need to wait for address field radio button");
                }
            }
        } while (null == addressFeldRadio);
        addressFeldRadio.click();
        WebElement addressFeldArea = driver.findElement(By.id("to-adressfeld"));
        Address address = order.getShipping().getAddress();
        addressFeldArea.sendKeys(address.getName().getFull());
        addressFeldArea.sendKeys("\n");
        addressFeldArea.sendKeys(address.getFull());
        if (Country.DE != address.getCountry()) {
            addressFeldArea.sendKeys("\n");
            addressFeldArea.sendKeys(address.getCountry().getName());
        }
        WebElement proceedButton = driver.findElement(By.xpath("//input[@type='submit' and @value[contains(.,'Adresse') and contains(.,'bernehmen')]]"));
        proceedButton.click();
    }

    private static final Map<Domestic, By> domesticTab = new EnumMap<Domestic, By>(Domestic.class);
    private static final Map<Stamp, By> stampButton = new EnumMap<Stamp, By>(Stamp.class);

    static {
        domesticTab.put(Domestic.NATIONAL, By.xpath("//li/span[text()='National']"));
        domesticTab.put(Domestic.INTERNATIONAL, By.xpath("//li/span[text()='International']"));
        stampButton.put(Stamp.KOMPAKTBRIEF, By.id("0.9 Kompaktbrief"));
        stampButton.put(Stamp.GROSSBRIEF, By.id("1.45 Großbrief"));
        stampButton.put(Stamp.MAXIBRIEF, By.id("2.4 Maxibrief"));
        stampButton.put(Stamp.MAXIBRIEF_EINSCHREIBEN, By.id("2.4 Maxibrief"));
        stampButton.put(Stamp.GROSSBRIEF_INTERNATIONAL, By.id("3.45 Großbrief"));
        stampButton.put(Stamp.GROSSBRIEF_INTERNATIONAL_EINSCHREIBEN, By.id("3.45 Großbrief"));
        stampButton.put(Stamp.GROSSBRIEF_INTERNATIONAL_100EURO, By.id("3.45 Großbrief"));
    }
}

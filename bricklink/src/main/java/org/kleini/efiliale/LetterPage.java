/*
 * GPL v3
 */

package org.kleini.efiliale;

import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement addToShoppingCartButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='In den Warenkorb']")));
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
        addressFeldArea.sendKeys(createAddressFieldText(order.getShipping().getAddress()));
        WebElement proceedButton = driver.findElement(By.xpath("//input[@type='submit' and @value[contains(.,'Adresse') and contains(.,'bernehmen')]]"));
        proceedButton.click();
    }

    private String createAddressFieldText(Address address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address.getName().getFull());
        sb.append('\n');
        int addressLines = Country.DE == address.getCountry() ? 4 : 3;
        sb.append(shortenAddress(address.getFull(), addressLines));
        if (Country.DE != address.getCountry()) {
            sb.append('\n');
            sb.append(address.getCountry().getName().toUpperCase());
        }
        return sb.toString();
    }

    private String shortenAddress(String fullAddress, int addressLines) {
        List<String> lines = new LinkedList<String>();
        for (String line : fullAddress.split("\r?\n")) {
            lines.add(line);
        }
        while (lines.size() > addressLines) {
            int shortestPos = findShortest(lines);
            if (shortestPos +1 == lines.size() || (shortestPos > 0 && lines.get(shortestPos - 1).length() <= lines.get(shortestPos + 1).length())) {
                lines.set(shortestPos - 1, lines.get(shortestPos - 1) + ", " + lines.get(shortestPos));
            } else if (shortestPos == 0 || (shortestPos < lines.size() - 1 && lines.get(shortestPos + 1).length() <= lines.get(shortestPos - 1).length())) {
                lines.set(shortestPos + 1, lines.get(shortestPos) + ", " + lines.get(shortestPos + 1));
            }
            lines.remove(shortestPos);
        }
        return String.join("\n", lines);
    }

    private String[] combine(String[] lines, int shortestPos, int prevNext) {
        String[] retval = new String[lines.length - 1];
        System.arraycopy(lines, 0, retval, 0, shortestPos);
        if (-1 == prevNext) {
            retval[shortestPos + prevNext] += ", " + lines[shortestPos];
        } else {
            retval[shortestPos] = lines[shortestPos] + ", " + lines[shortestPos + prevNext];
        }
        System.arraycopy(lines, shortestPos + 1, retval, shortestPos, lines.length - shortestPos - 1);
        // TODO Auto-generated method stub
        return retval;
    }

    private int findShortest(List<String> lines) {
        int pos = -1;
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).length() < length) {
                pos = i;
                length = lines.get(i).length();
            }
        }
        return pos;
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

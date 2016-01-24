/*
 * GPLv3
 */

package org.kleini.bricklink.selenium;

import java.util.List;

import org.kleini.bricklink.data.Color;
import org.kleini.bricklink.data.ItemType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * {@link CatalogItemPage}
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CatalogItemPage {

    private final WebDriver driver;

    public CatalogItemPage(WebDriver driver) {
        this.driver = driver;
    }

    public Color guessColor(ItemType type, String itemId) throws Exception {
        driver.get("https://alpha.bricklink.com/pages/clone/catalogitem.page?" + type.getId() + "=" + itemId);
        driver.findElement(By.xpath("//td[contains(text(),'Color Info')]")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("#_idTabContentsC table tbody tr td span a"));
        for (WebElement element : elements) {
            String text = element.getText();
            Color color = Color.byName(text);
            if (!Color.NOT_APPLICABLE.equals(color)) {
                return color;
            }
        }
        return Color.NOT_APPLICABLE;
    }
}

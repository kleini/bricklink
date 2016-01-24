/*
 * GPLv3
 */

package org.kleini.bricklink.selenium.catalog;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.kleini.bricklink.data.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Iterates through category part list pages and collects all item identifier.
 *
 * @author <a href="mailto:himself@kleini.org">Marcus Klein</a>
 */
public final class CategoryListPage {

    private final WebDriver driver;

    public CategoryListPage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public List<String> getPartList(Category category) throws Exception {
        int catId = category.getIdentifier();
        driver.get("https://www.bricklink.com/catalogList.asp?pg=1&catType=P&catString=" + catId);
        List<WebElement> elements = driver.findElements(By.xpath("//a[contains(@href,'/catalogList.asp?pg=') and ('&catString=" + catId + "&catType=P' = substring(@href, string-length(@href)-23, 24))]"));
        Pattern pattern = Pattern.compile(".*/catalogList.asp\\?pg=(\\d+)&catString=" + catId + "&catType=P");
        int pageNum = 1;
        for (WebElement element : elements) {
            String href = element.getAttribute("href");
            Matcher matcher = pattern.matcher(href);
            if (!matcher.matches()) {
                continue;
            }
            pageNum = Math.max(pageNum, Integer.parseInt(matcher.group(1)));
        }
        Pattern pattern2 = Pattern.compile(".*/catalogitem.page\\?P=(.+)");
        List<String> retval = new LinkedList<String>();
        for (int page = 1; page <= pageNum; page++) {
            if (1 != page) {
                driver.get("https://www.bricklink.com/catalogList.asp?pg=" + page + "&catType=P&catString=" + catId);
            }
            List<WebElement> partLinks = driver.findElements(By.cssSelector("a[href^=\"https://alpha.bricklink.com/pages/clone/catalogitem.page?P=\"]"));
            for (WebElement partLink : partLinks) {
                String href = partLink.getAttribute("href");
                Matcher matcher = pattern2.matcher(href);
                if (!matcher.matches()) {
                    throw new Exception("Can not extract part identifier");
                }
                String partId = matcher.group(1);
                retval.add(partId);
            }
        }
        return retval;
    }
}

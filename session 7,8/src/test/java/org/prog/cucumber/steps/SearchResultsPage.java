package org.prog.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    private final WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getSearchResults() {
        return driver.findElements(By.className
                ("goods-tile__content"));
    }

    public WebElement getFirstProductElement() {
        return getSearchResults().get(0);
    }

    public String getPriceForProduct(WebElement productElement) {
        WebElement priceElement = productElement.findElement(By.className("goods-tile__price-value"));
        return priceElement.getText();
    }

    public String getDescriptionForProduct(WebElement productElement) {
        WebElement descriptionElement = productElement.findElement(By.className("goods-tile__title"));
        return descriptionElement.getText();
    }
}

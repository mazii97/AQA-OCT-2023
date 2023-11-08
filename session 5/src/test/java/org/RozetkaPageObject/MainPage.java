package org.RozetkaPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver;
    private final String url = "https://rozetka.com.ua/";

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get(url);
    }

    public void searchForProduct(String productName) {
        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys(productName);

        WebElement searchButton = driver.findElement(By.cssSelector("body > app-root > div > div > rz-header > rz-main-header > header > div > div > div > form > button"));
        searchButton.click();
    }
}

package org.prog.cucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.prog.RozetkaPageObject.MainPage;

import java.util.List;



public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            MainPage mainPage = new MainPage(driver);
            mainPage.open();
            mainPage.searchForProduct("IPhone 15 Pro");

            SearchResultsPage resultsPage = new SearchResultsPage(driver);

            List<WebElement> IPhone15Pro = resultsPage.getSearchResults();

            if (!IPhone15Pro.isEmpty()) {
                WebElement firstProductElement = resultsPage.getFirstProductElement();

                String price = resultsPage.getPriceForProduct(firstProductElement);
                String description = resultsPage.getDescriptionForProduct(firstProductElement);

                System.out.println("Цена и описание первого iPhone 15 Pro");
                System.out.println("-----------------------");
                System.out.println("Цена: " + price);
                System.out.println("Описание: " + description);
                System.out.println("-----------------------");
            } else {
                System.out.println("Продукт не знайдено.");
            }
        } finally {
            driver.quit();
        }
    }
}
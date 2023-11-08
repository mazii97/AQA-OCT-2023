package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

//public class SeleniumDemo {
//
//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        try {
//            driver.get("https://google.com/");
//            List<WebElement> buttons = driver.findElements(By.xpath("//button"));
//            if (buttons.size() == 5) {
//                //we see cookies!
//                WebElement element = buttons.get(3);
//                element.click();
//            }
//            WebElement searchInput = driver.findElement(By.name("q"));
//            searchInput.sendKeys("Bill Gates");
//            searchInput.click();
//            new WebDriverWait(driver, Duration.ofSeconds(30L))
//                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//ul[@role='listbox']/li"), 2));
//            WebElement searchBtn = driver.findElements(By.xpath("//input[@name='btnK']")).get(0);
//            searchBtn.click();
//            List<WebElement> searchResults = new WebDriverWait(driver, Duration.ofSeconds(30L))
//                    .until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//a/h3"), 5));
//
//            boolean searchSuccesss = searchResults.stream().anyMatch(webElement -> webElement.getText().contains("Bill Gates"));
//            if (!searchSuccesss) {
//                throw new RuntimeException("Bill Gates not found!");
//            }
//            System.out.println("SUCCESS!");
//        } finally {
//            driver.quit();
//        }
//    }
    public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://rozetka.com.ua/");
            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("iPhone 15 Pro");
            WebElement searchFind = driver.findElement(By.cssSelector("body > app-root > div > div > rz-header > rz-main-header > header > div > div > div > form > button"));
            searchFind.click();
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("goods-tile__content")));

            List<WebElement> iPhone15Pro = driver.findElements(By.className("goods-tile__content"));

            // 1-й айфон на странице

            WebElement firstProductElement = driver.findElement(By.className("goods-tile__content"));

            WebElement priceIphone = firstProductElement.findElement(By.className("goods-tile__price-value"));
            WebElement descriptionIphone = firstProductElement.findElement(By.className("goods-tile__title"));

            String price = priceIphone.getText();
            String description = descriptionIphone.getText();
            System.out.println("Цена и описание первого iPhone 15 Pro");
            System.out.println("-----------------------");
            System.out.println("Цена: " + price);
            System.out.println("Описание: " + description);
            System.out.println("-----------------------");

        } finally {
            driver.quit();
        }
    }
}

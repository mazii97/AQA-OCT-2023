package org.prog.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

//    public static void main(String[] args) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com/");
//        List<WebElement> buttons = driver.findElements(By.xpath("//button"));
//        if (buttons.size() == 5) {
//            //we see cookies!
//            WebElement element = buttons.get(3);5
//            element.click();
//        }
//        WebElement searchInput = driver.findElement(By.name("q"));
//        searchInput.sendKeys("Bill Gates");
//        searchInput.click();
//        Thread.sleep(1500);
//        WebElement searchBtn = driver.findElements(By.xpath("//input[@name='btnK']")).get(0);
//        searchBtn.click();
//        driver.quit();
//    }


        public static void main(String[] args) throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.get("https://rozetka.com.ua/");

            try {
                WebElement cookiePopup = driver.findElement(By.className("cookie-warning__close"));
                cookiePopup.click();
            }
            catch (Exception e) {
                //We see cookies!
            }

            WebElement searchInput = driver.findElement(By.name("search"));
            searchInput.sendKeys("Iphone 14 pro");
            searchInput.submit();
            Thread.sleep(5000);
            WebElement searchFind = driver.findElement(By.cssSelector("body > app-root > div > div > rz-header > rz-main-header > header > div > div > div > form > button"));
            searchFind.click();
            Thread.sleep(5000);
            driver.quit();
            }
        }







package org.prog.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SearchSteps {
    private final String BASE_URL = "https://rozetka.com.ua/";
    private Response response;

    @Given("User is on the Rozetka website")
    public void loadRozetkaWebsite() {
        System.setProperty("webdriver.chrome.driver", "path/to/chrome/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get(BASE_URL);
    }

    @When("User searches for {string}")
    public void searchForProduct(String product) {
        response = RestAssured.given()
                .param("search", product)
                .get(BASE_URL + "/search/");
    }

    @Then("Search results for {string} are displayed")
    public void verifySearchResults(String product) {
        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertTrue(response.body().asString().contains(product));
    }

}
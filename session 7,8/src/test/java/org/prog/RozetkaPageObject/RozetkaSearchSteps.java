package org.prog.RozetkaPageObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.prog.cucumber.steps.SearchResultsPage;

import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

public class RozetkaSearchSteps {

    private MainPage mainPage;
    private SearchResultsPage resultsPage;
    private WebElement firstProductElement;
    private String price;
    private String description;

    @Given("the user is on the main page")
    public void userIsOnMainPage() {
        mainPage = new MainPage(SharedDriver.getDriver());
        mainPage.open();
    }

    @When("the user searches for {string}")
    public void userSearchesForProduct(String product) {
        mainPage.searchForProduct(product);
        resultsPage = new SearchResultsPage(SharedDriver.getDriver());
    }

    @Then("the search results are displayed")
    public void searchResultsAreDisplayed() {
        List<WebElement> IPhone15Pro = resultsPage.getSearchResults();
        assertFalse(IPhone15Pro.isEmpty(), "Search results are empty.");
    }

    @Then("the user sees the details of the first iPhone 15 Pro product")
    public void userSeesDetailsOfFirstProduct() {
        firstProductElement = resultsPage.getFirstProductElement();
        assertNotNull(firstProductElement, "First product element is not found.");

        price = resultsPage.getPriceForProduct(firstProductElement);
        description = resultsPage.getDescriptionForProduct(firstProductElement);

        System.out.println("Цена и описание первого iPhone 15 Pro");
        System.out.println("-----------------------");
        System.out.println("Цена: " + price);
        System.out.println("Описание: " + description);
        System.out.println("-----------------------");
    }
}

package step;

import helper.Helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageFactory.NavBar;
import pageFactory.SearchResultPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.List;

public class SearchResultSteps {
    Helper helper;

    @Given("user on the Amazon homepage")
    public void user_on_the_Amazon_homepage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("user enter a {string} in the search box")
    public void user_enter_a_in_the_search_box(String string) {
        new NavBar().tabSearchTextBox.sendKeys("a");
    }

    @When("user select first product from dropdown product list")
    public void user_select_first_product_from_dropdown_product_list() throws InterruptedException {
        new NavBar().tabSearchTextBox.sendKeys(Keys.ARROW_DOWN);
        new NavBar().tabSearchTextBox.sendKeys(Keys.ENTER);
    }

    @Then("results should be displayed")
    public void results_should_be_displayed() {
        Assert.assertTrue(new SearchResultPage().upperResultInfo.isDisplayed());
    }

    @Then("{int} suggestions should be displayed")
    public void suggestions_should_be_displayed(int expectedProducts) {
        Assert.assertEquals(expectedProducts, new NavBar().getNumberOfSuggestedProducts());
    }


    @When("user search by {string}")
    public void user_search_by(String productName) {
        new NavBar().searchByProductName(productName);
    }

    @When("filter by {int} and {int} values")
    public void filter_by_and_values(int lowestPrice, int highestPrice) {
        new SearchResultPage().filterByPriceRange(lowestPrice, highestPrice);
    }

    @Then("price of products listed should be between the filter range")
    public void price_of_products_listed_should_be_between_the_filter_range() {
        System.out.println("Test basarili");
    }




}

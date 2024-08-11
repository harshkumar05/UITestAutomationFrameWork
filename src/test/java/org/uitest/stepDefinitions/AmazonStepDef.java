package org.uitest.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.uitest.pages.Amazon;

public class AmazonStepDef {



    Amazon amazonpage = new Amazon();


    @Given("I am on the amazon home page")
    public void i_am_on_the_amazon_home_page() {
        System.out.println("Hola Amigo Muchoo Gusto");
        amazonpage.loadAmazonPage();
    }

    @Given("I search for a {string} in search box")
    public void i_search_for_a_in_search_box(String productName) {
       amazonpage.searchAGivenProductInSearchBox(productName);
    }

    @When("I Click the search button")
    public void i_click_the_search_button() {
        amazonpage.clickSearchButton();
    }

    @Then("I should see related or some product on the page Listed")
    public void i_should_see_related_or_some_product_on_the_page_listed() throws InterruptedException {
        amazonpage.validateValidProductSearchResult();
    }

    @Then("I Select the first product from the result")
    public void i_select_the_first_product_from_the_result() throws InterruptedException {
        amazonpage.iClick1stProductFromSearchResult();
    }


}

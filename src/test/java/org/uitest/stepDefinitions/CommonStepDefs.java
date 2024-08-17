package org.uitest.stepDefinitions;

import io.cucumber.java.en.Given;
import org.uitest.pages.BasePage;

public class CommonStepDefs {

    BasePage basePage = new BasePage();


    @Given("I am on the {string}")
    public void i_am_on_the(String pageName) {
        basePage.hitURL(pageName.toLowerCase());
    }

}

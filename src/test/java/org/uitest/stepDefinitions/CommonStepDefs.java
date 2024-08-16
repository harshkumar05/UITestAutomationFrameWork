package org.uitest.stepDefinitions;

import io.cucumber.java.en.Given;
import org.uitest.pages.BasePage;

public class CommonStepDefs {

    BasePage basePage = new BasePage();
    @Given("I am on the {string} page")
    public void iAmOnThePage(String arg0) {
        basePage.hitURL(arg0);
    }
}

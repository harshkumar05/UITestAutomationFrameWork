package org.uitest.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.uitest.Driver.DriverFactory;

import java.util.List;

@Data
public class Amazon extends BasePage {

    @FindBy(css = "#twotabsearchtextbox")
    WebElement search_box;
    @FindBy(css = "#nav-search-submit-button")
    WebElement search_button;
    @FindBy(css="div[cel_widget_id^='MAIN-SEARCH_RESULTS']")
    List<WebElement> search_result_cards;

    @FindBy(css="div[data-cy^='title-recipe']")
    List<WebElement> result_card_product_info;
    WebDriver driver;

    public Amazon(){
        super();
        this.driver=new ChromeDriver();
        PageFactory.initElements(driver,this);
    }
    public void loadAmazonPage(){
      driver.get("https://www.amazon.in/");
    }

    public void searchAGivenProductInSearchBox(String productName){
        search_box.sendKeys(productName);
    }

    public void clickSearchButton(){
        search_button.click();
    }

    public void validateValidProductSearchResult() throws InterruptedException {
       Thread.sleep(10000);
       Assert.assertNotEquals("No Such Product",search_result_cards.size(),0);
    }

    public void iClick1stProductFromSearchResult() throws InterruptedException {
        Thread.sleep(10000);
        result_card_product_info.get(0).click();
    }
}

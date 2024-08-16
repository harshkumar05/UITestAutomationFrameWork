package org.uitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.uitest.utils.YamlUtils;

public class BasePage {

    WebDriver driver = new ChromeDriver();
    YamlUtils yamlUtils = new YamlUtils();
    public BasePage(){
        super();
        this.driver=new ChromeDriver();
        PageFactory.initElements(driver,this);
    }

    public void hitURL(String pageName){
        yamlUtils.getURL(pageName);
    }
}

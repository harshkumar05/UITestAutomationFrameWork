package org.uitest.pages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.uitest.Driver.DriverFactory;

@Data
public class Amazon {
    WebDriver driver;
    public Amazon(){
        super();
        this.driver=new ChromeDriver();
    }
    public void loadAmazonPage(){
      driver.get("https://www.amazon.in/");
    }
}

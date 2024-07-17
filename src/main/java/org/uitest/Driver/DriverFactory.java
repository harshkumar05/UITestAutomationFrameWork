package org.uitest.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {
    public static WebDriver driver;
    public DriverFactory(){
       driver = new ChromeDriver();
    }
    // will continue tmrw good night
}

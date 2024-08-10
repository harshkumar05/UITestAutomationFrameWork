package org.uitest.Driver;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



public class DriverFactory {

   public static WebDriver driver;
   public DriverFactory(){
       initDriver();
   }
    public void initDriver() {
        driver=new ChromeDriver();
    }

}

package org.uitest.utils;
import lombok.Data;



@Data
public class Configurations {
    public String environment;
    public String brand;
    public String locale;
    public Configurations(){
        this.environment=System.setProperty("environment","prod");
        this.brand=System.setProperty("brand","amazon");
        this.locale=System.setProperty("locale","en-in");
    }
}

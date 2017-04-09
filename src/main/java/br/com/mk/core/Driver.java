package br.com.mk.core;

import br.com.mk.properties.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Maikon Canuto on 09/04/2017.
 */
public class Driver {

    private static WebDriver driver;

    static{
        Properties.setPropertyAllDriver();
        driver = new ChromeDriver();
    }

    public static WebDriver getDriver(){
        return Driver.driver;
    }

    public static void setDriver(WebDriver driver){
        Driver.driver = driver;
    }
}

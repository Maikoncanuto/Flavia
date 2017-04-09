package br.com.mk.properties;

/**
 * Created by Maikon Canuto on 09/04/2017.
 */
public class Properties {
    public static void setPropertyAllDriver(){
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        System.setProperty("phantomjs.binary.path", "drivers/phantomjs.exe");
    }

}

package com.test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxDriverConfiguration {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.gecko.driver", "D:/Dokumenty/!Programowanie/Java/InteliiJ_for_Selenium/MozillaDriver/geckodriver-v0.16.1-win64/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        // Konfiguracja drivera Firefox
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();


        return driver;

    }

}

package com.test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class EdgeDriverConfiguration {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.edge.driver", "D:/Dokumenty/!Programowanie/Java/InteliiJ_for_Selenium/EdgeDriver/edgedriver_win64/msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        // Konfiguracja drivera Edge
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();


        return driver;

    }

}

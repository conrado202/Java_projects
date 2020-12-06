package com.test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverConfiguration {

    public static WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "D:/Dokumenty/!Programowanie/Java/InteliiJ_for_Selenium/ChromeDriver/chromedriver_new2_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // Konfiguracja drivera Chrome
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();


        return driver;

    }

}

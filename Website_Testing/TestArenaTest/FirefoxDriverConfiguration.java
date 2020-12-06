package com.test.project.uja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;


public class FirefoxDriverConfiguration {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.gecko.driver","E:\\Dokumenty\\!Podyplomowe_UJ\\Techniki_i_narzedzia_automatyzacji\\Automatyzacja_testowania\\mozilladriver\\geckodriver-v0.16.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver ();

        // Konfiguracja drivera Firefox
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();

        return driver;
    }

}

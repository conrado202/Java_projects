package com.test.project.uja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.concurrent.TimeUnit;

public class OperaDriverConfiguration {

    private static WebDriver driver;

    public static WebDriver getDriver() {

        System.setProperty("webdriver.opera.driver", "E:\\Dokumenty\\!Podyplomowe_UJ\\Techniki_i_narzedzia_automatyzacji\\Automatyzacja_testowania\\operadriver\\operadriver_win64\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();
        driver.get("https://duckduckgo.com/");
        // Konfiguracja drivera Opera
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();

        return driver;
    }



}

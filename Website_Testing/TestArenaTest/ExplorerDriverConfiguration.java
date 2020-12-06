package com.test.project.uja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;


public class ExplorerDriverConfiguration {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        System.setProperty("webdriver.ie.driver", "E:\\Dokumenty\\!Podyplomowe_UJ\\Techniki_i_narzedzia_automatyzacji\\Automatyzacja_testowania\\iedriver\\IEDriverServer_x64_3.4.0\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        // Konfiguracja drivera Internet Explorer
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);    // Timeout strony ustawiony na 30s (po 30 sek bez dzialania sama sie wylaczy)
        driver.manage().window().maximize();

        return driver;
    }

}

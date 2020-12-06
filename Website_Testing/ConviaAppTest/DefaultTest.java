package com.test.selenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;


public class DefaultTest {

    public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String browser) {

        // Klasa konfiguracyjna dla przegladarki firefox
        if (browser.equals("firefox")){
            driver = FirefoxDriverConfiguration.getDriver();
        }

        // Klasa konfiguracyjna dla przegladarki edge
        else if (browser.equals("edge")){
            driver = EdgeDriverConfiguration.getDriver();
        } else{
            driver = ChromeDriverConfiguration.getDriver();
        }

        driver.get("https://game.convia.app/login");

    }


    @AfterTest
    public void tearDown() {
        driver.close();
    }


}

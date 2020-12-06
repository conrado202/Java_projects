package com.test.project.uja;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class DefaultTest {

    public static WebDriver driver;             // Zabezpieczamy ten driver, tak aby nigdzie indziej sie nie znajdowal w zadnym innym tescie, nie bedzie dostepny

                                                // BeforeSuit, azeby sie odwolywalo do wszystkich suit w projekcie testowym, zeby ten loginTest tez z tego korzystal i czytak ustawienia przegladarki
                                                // Adnotacja do ustawienia naszej klasy na samym poczatku

    @Parameters ({"browser"})
    @BeforeTest
        public void setUp(String browser) {

            // Klasa konfiguracyjna dla przegladarki firefox
        if (browser.equals("firefox")){
            driver = FirefoxDriverConfiguration.getDriver();
        }
            // Klasa konfiguracyjna dla przegladarki opera
         else if (browser.equals("opera")){
            driver = OperaDriverConfiguration.getDriver();
        }
        // Klasa konfiguracyjna dla przegladarki ie
         else if (browser.equals("ie")){
            driver = ExplorerDriverConfiguration.getDriver();
        } else{
            driver = ChromeDriverConfiguration.getDriver();
        }

//        switch(browser){
//            case "chrome":
//                driver = FirefoxDriverConfiguration.getDriver();
//                break;
//            case "opera":
//                driver = OperaDriverConfiguration.getDriver();
//
//                case "switch" -> driver = FirefoxDriverConfiguration.getDriver();
//
//        }




        driver.get("http://demo.testarena.pl/zaloguj");

      }


    @AfterTest
    public void tearDown() {
        driver.close();
    }

}

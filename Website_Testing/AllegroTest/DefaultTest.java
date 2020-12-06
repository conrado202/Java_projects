import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class DefaultTest {

    public static WebDriver driver;

    @Parameters({"browser"})
    @BeforeTest
    public void setUp(String browser) {

        // Klasa konfiguracyjna dla przegladarki firefox
//        if (browser.equals("firefox")) {
////            driver = FirefoxDriverConfiguration.getDriver();
////        }
////        // Klasa konfiguracyjna dla przegladarki opera
////        else if (browser.equals("opera")) {
////            driver = OperaDriverConfiguration.getDriver();
////        }
////        // Klasa konfiguracyjna dla przegladarki ie
////        else if (browser.equals("ie")) {
////            driver = ExplorerDriverConfiguration.getDriver();
////        } else {
        if (browser.equals("chrome")) {
            driver = ChromeDriverConfiguration.getDriver();
        }

//        driver.get("http://demo.testarena.pl/zaloguj");
        driver.get("http://allegro.pl/");

    }

        @AfterTest
        public void tearDown() {
            driver.close();
        }

}

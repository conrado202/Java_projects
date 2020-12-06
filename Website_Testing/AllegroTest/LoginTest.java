import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest  extends DefaultTest {

    @Test
    public void loginTest() {
        driver.findElement(By.id("email")).sendKeys("administrator@testarena.pl");
        driver.findElement(By.id("password")).sendKeys("sumXQQ72$L");
        driver.findElement(By.id("login")).click();
        Assert.assertTrue(driver.findElement(By.xpath("html/body/header/div[2]/div[2]/a/span")).isDisplayed());
    }
}

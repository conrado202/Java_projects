import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FindProduct extends DefaultTest {

    @Test
    public void findProduct() {

        if (driver.findElement(By.xpath("//*[@id=\"dialog-title\"]")).isDisplayed()){
            driver.findElement(By.xpath("/html/body/div[2]/div[7]/div/div[2]/div/div[2]/button[2]")).click();

        }

        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div[1]/div/form/input")).sendKeys("rower");
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div/div/div[1]/div/form/button")).click();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/h1/span[1]")).isDisplayed());
    }
}

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.print.DocFlavor;

public class FindPrice extends DefaultTest {

    @Test
    public void findPrice() {

        if (driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div/div/div[1]/div/h1/span[1]")).isDisplayed()){

            String first_price = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/div/section[1]/article[1]/div/div[2]/div[2]/div/div/span")).getText();
            String second_price = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/div/div/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div[2]/div[1]/div/section[2]/article[1]/div/div[2]/div[2]/div/div/span")).getText();

            System.out.println(first_price);
            System.out.println(second_price);

            String first_price_remove_currency_symbol = first_price.substring(1, first_price.length());
            String second_price_remove_currency_symbol = second_price.substring(1, second_price.length());

            System.out.println(first_price_remove_currency_symbol);
            System.out.println(second_price_remove_currency_symbol);

            // float difference = Float.parseFloat(second_price_remove_currency_symbol) - Float.parseFloat(first_price_remove_currency_symbol);
            int difference = Integer.parseInt(second_price_remove_currency_symbol) - Integer.parseInt(first_price_remove_currency_symbol);
            System.out.println("Difference between the price is " + difference);

        }
    }
}

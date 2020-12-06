package com.test.project.uja;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends DefaultTest {

    @Test
    public void logoutTest() {
        driver.findElement(By.xpath("//*[@id=\"head-top\"]/div[2]/div[2]/a")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"text-2\"]/div/form")).isDisplayed());
    }

}

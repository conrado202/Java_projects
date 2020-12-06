package com.test.selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends DefaultTest{

    @Test
    public void loginTest(){


        //WebDriverWait wait = new WebDriverWait(driver, 6000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/main[@class='v-content fill-height']/div[@class='v-content__wrap']/div[@class='container fill-height container--fluid']/div[@class='row mr-auto ml-auto align-center justify-center']/div[@class='col-sm-8 col-md-4 col-12']/div[@class='elevation-12 v-card v-sheet theme--light']/header[@class='v-sheet v-sheet--tile theme--light v-toolbar v-toolbar--flat grey lighten-4']/div[@class='v-toolbar__content']/div[@class='v-toolbar__title']")));

        driver.findElement(By.id("input-34")).sendKeys("FirstUser@1");
        driver.findElement(By.id("password")).sendKeys("1234");
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/main[@class='v-content fill-height']/div[@class='v-content__wrap']/div[@class='container fill-height container--fluid']/div[@class='row mr-auto ml-auto align-center justify-center']/div[@class='col-sm-8 col-md-4 col-12']/div[@class='elevation-12 v-card v-sheet theme--light']/div[@class='v-card__actions']/button[@class='v-btn v-btn--block v-btn--contained theme--light v-size--default grey lighten-4']")).click();

        Assert.assertTrue(driver.findElement(By.xpath(("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='map-container']/div[@class='swiper-wrapper']/div[@class='swiper-slide']"))).isDisplayed());

        // driver.close();
    }

}

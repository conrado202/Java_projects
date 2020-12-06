package com.test.selenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends DefaultTest {

    @Test
    public void logoutTest(){
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/div[@class='v-bottom-navigation v-item-group theme--light v-bottom-navigation--grow v-bottom-navigation--fixed']/a[@class='v-btn v-btn--contained v-btn--router theme--light v-size--default']/span[@class='v-btn__content']")).click();
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='overflow-hidden']/div[@class='container overflow-y-auto form-container']/form[@class='v-form']/button[@class='mt-2 v-btn v-btn--block v-btn--contained theme--light v-size--default transparent'][2]/span[@class='v-btn__content']")).click();

        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/main[@class='v-content fill-height']/div[@class='v-content__wrap']/div[@class='container fill-height container--fluid']/div[@class='row mr-auto ml-auto align-center justify-center']/div[@class='col-sm-8 col-md-4 col-12']/div[@class='elevation-12 v-card v-sheet theme--light']/header[@class='v-sheet v-sheet--tile theme--light v-toolbar v-toolbar--flat grey lighten-4']/div[@class='v-toolbar__content']/div[@class='v-toolbar__title']")).isDisplayed());

        // driver.close();
    }

}

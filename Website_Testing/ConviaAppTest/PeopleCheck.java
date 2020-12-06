package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PeopleCheck extends DefaultTest {

    @Test
    public void peopleCheck(){
        Actions actions = new Actions(driver);

        /*Clicking on specific objects and people to check reaction of application*/
        /*Click on Gluptas*/
        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='map-container']/div[@class='swiper-wrapper']/div[@class='swiper-slide']/div[3]"))).click().perform();
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='map-container']/div[@class='swiper-wrapper']/div[@class='swiper-slide']/div[3]")).click();
        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog overflow-visible bshadow-none v-dialog--active']/div[@id='quest-dialog-card']/div[@class='v-card__actions text-center']/div[@class='row']/div[@class='col col-12']/button[@class='v-btn v-btn--block v-btn--contained v-btn--rounded theme--light v-size--large light-green accent-4 white--text']/span[@class='v-btn__content']")).click();

//        /*Click on Theatre*/
//        actions.moveToElement(driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='map-container']/div[@class='swiper-wrapper']/div[@class='swiper-slide']/div[5]"))).click().perform();
//        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-application--wrap']/main[@class='v-content']/div[@class='v-content__wrap']/div[@class='map-container']/div[@class='swiper-wrapper']/div[@class='swiper-slide']/div[5]")).click();
//        driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog overflow-visible bshadow-none v-dialog--active']/div[@id='quest-dialog-card']/div[@class='v-card__actions text-center']/div[@class='row']/div[@class='col col-12']/button[@class='v-btn v-btn--block v-btn--contained v-btn--rounded theme--light v-size--large light-green accent-4 white--text']/span[@class='v-btn__content']")).click();


        /*Window with confirmation from Gluptas is displayed*/
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog overflow-visible bshadow-none v-dialog--active']/div[@id='quest-dialog-card']/div[@id='quest-dialog-title']")).isDisplayed());

//        /*Window with confirmation from Theatre is displayed*/
//        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[@id='app']/div[@class='v-dialog__content v-dialog__content--active']/div[@class='v-dialog overflow-visible bshadow-none v-dialog--active']/div[@id='quest-dialog-card']/div[@class='v-card__text subtitle-1 font-weight-bold font-weight-black pb-0']")).isDisplayed());

        // driver.close();
    }
}

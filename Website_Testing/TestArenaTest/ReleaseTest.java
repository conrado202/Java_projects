package com.test.project.uja;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

public class ReleaseTest extends DefaultTest {

    @BeforeClass
    public void releaseSetUp(){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[3]/a")).click();
    }

    @Test
    public void releaseTest(){

        //Klikniecie na "Dodaj wydanie"
        driver.findElement(By.xpath("//*[@id=\"content\"]/article/nav/ul/li/a")).click();

        //Znalezienie pola o id Name i wyczyszczenie jego zawartosci, a nastepnie uzupelnienie go nowym napisem
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Wydanie_" + new Date().getTime());
        driver.findElement(By.id("startDate")).sendKeys("2017-07-01");
        driver.findElement(By.id("endDate")).sendKeys("2017-12-01");
        driver.findElement(By.id("description")).sendKeys("Najnowsze wydanie");

        //Zapisanie nowo dodango wydania
        driver.findElement(By.xpath("//*[@id=\"save\"]")).click();

        //Sprawdzenie czy wydanie faktycznie sie zapisalo
        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")), "Wydanie zostało dodane."));

        // Sprawdzamy, czy wydanie sie dodalo przez wyswietlenie napisu
        Assert.assertEquals("Wydanie zostało dodane.", driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")).getText());

        //


    }



}

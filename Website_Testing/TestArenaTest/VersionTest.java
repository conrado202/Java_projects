package com.test.project.uja;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

public class VersionTest extends DefaultTest{

    @BeforeClass
    public void SetUp(){
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[6]/a")).click();
    }

    @Test
    public void VerTest(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/article/nav/ul/li/a")).click();

        //Dodanie wersji o nazwie "wersja ..."
        driver.findElement(By.id("name")).clear();                  // Czyszczenie pola przed wpisaniem w niego nowej wartosci
        driver.findElement(By.id("name")).sendKeys("wersja " + new Date().getTime());
        // Zapisanie wersji
        driver.findElement(By.id("save")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")), "Wersja została dodana."));

        // Sprawdzamy, czy srodowisko sie dodalo przez wyswietlenie napisu
        Assert.assertEquals("Wersja została dodana.", driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")).getText());
    }


}

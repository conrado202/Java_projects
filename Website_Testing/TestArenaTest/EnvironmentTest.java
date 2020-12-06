package com.test.project.uja;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;


public class EnvironmentTest extends DefaultTest {

    @BeforeClass
    public void environmentSetUp() {
        driver.findElement(By.xpath("//*[@id=\"wrapper\"]/ul/li[5]/a")).click();
    }

    @Test
    public void addEnvironmentTest() {

        // Dodanie srodowiska
        driver.findElement(By.xpath("//*[@id=\"content\"]/article/nav/ul/li/a")).click();
        //Dodanie srodowiska o nazwie "środowisko 1"
        driver.findElement(By.id("name")).clear();                  // Czyszczenie pola przed wpisaniem w niego nowej wartosci
        driver.findElement(By.id("name")).sendKeys("środowisko " + new Date().getTime());
        // Zapisanie srodowiska
        driver.findElement(By.id("save")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")), "Środowisko zostało dodane."));

        // Sprawdzamy, czy srodowisko sie dodalo przez wyswietlenie napisu
        Assert.assertEquals("Środowisko zostało dodane.", driver.findElement(By.xpath("//*[@id=\"j_info_box\"]/p")).getText());
    }


}

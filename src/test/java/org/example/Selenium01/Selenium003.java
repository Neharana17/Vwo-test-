package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Selenium003 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();

    }

    @Owner("Neha")
    @Test()
    public void testBrowser()  {
        driver.get("https://awesomeqa.com/webtable.html");
       int row= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
        int col= driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[1]/th")).size();
        System.out.println(row);
        System.out.println(col);

    }

    @AfterTest
    public void closeBrowser(){
        //   driver.quit();
    }

}



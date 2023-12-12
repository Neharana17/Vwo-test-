package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exceptions {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();


    }

    @Owner("Neha")
    @Test
    public void test() throws InterruptedException {
        try {


            String URL = "https://www.google.com/";
            driver.get(URL);

            WebElement el = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            driver.navigate().refresh();
            el.sendKeys("what is selenium");


        }catch (StaleElementReferenceException e){
            System.out.println(e.getMessage());
        }

    }

    @AfterTest
    public void closeBrowser () {

        // driver.quit();
    }
}






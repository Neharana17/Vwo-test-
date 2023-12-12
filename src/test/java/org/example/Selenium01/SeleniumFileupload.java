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

public class SeleniumFileupload {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();


    }

    @Owner("Neha")
    @Test
    public void test() throws InterruptedException {
        String URL = "https://awesomeqa.com/selenium/upload.html";
        driver.get(URL);

        WebElement Upload_file= driver.findElement(By.id("fileToUpload"));
        Upload_file.sendKeys("C:/Users/Neha Rana/IdeaProjects/LearningSelenium/src/test/java/org/example/Selenium01/data.txt");
        driver.findElement(By.name("submit")).click();
        System.out.println(" File uploaded sucessfully");
    }

    @AfterTest
    public void closeBrowser () {

        // driver.quit();
    }
}





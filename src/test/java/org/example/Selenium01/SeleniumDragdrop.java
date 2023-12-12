package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDragdrop {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();


    }

    @Owner("Neha")
    @Test
    public void test() throws InterruptedException {
        String URL = "https://the-internet.herokuapp.com/drag_and_drop";
        driver.get(URL);

        WebElement from= driver.findElement(By.id("column-a"));
        WebElement to= driver.findElement(By.id("column-b"));
        Actions bulider= new Actions(driver);
        //bulider.dragAndDrop(from,to).perform();
       // another way to use by click and hold and relese
        bulider.clickAndHold(from).moveToElement(to).release(to).build().perform();

    }

    @AfterTest
    public void closeBrowser () {

        // driver.quit();
    }
}





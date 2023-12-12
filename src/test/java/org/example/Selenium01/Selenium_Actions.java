package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium_Actions {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();


    }

    @Owner("Neha")
    @Test
    public void test() throws InterruptedException {
        String URL = "https://www.makemytrip.com/";
        driver.get(URL);

        Actions actions = new Actions(driver);
        Thread.sleep(10000);
//
//        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//img[@id='second-img']")))


        WebElement fromCity = driver.findElement(By.id("fromCity"));
        actions.moveToElement(fromCity).click().sendKeys("New Delhi, India").build().perform();


        List<WebElement> li = driver.findElements(By.xpath("//ul[@role=\"listbox\"]/li"));
        for (WebElement e : li) {
            if (e.getText().contains("New Delhi ,India")) {
                e.click();
            }

        }
        actions.sendKeys(Keys.PAGE_DOWN).build().perform();
        System.out.println("scroll down");
    }

        @AfterTest
        public void closeBrowser () {

            // driver.quit();
        }
    }




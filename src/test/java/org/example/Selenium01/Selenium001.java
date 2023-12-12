package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class Selenium001 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();

    }

    @Owner("Neha")
    @Test()
    public void testBrowser() throws InterruptedException {

        driver.get("https://app.vwo.com");
        driver.findElement(By.id("login-username")).sendKeys("auto123@inclusion.com");
        driver.findElement(By.id("login-password")).sendKeys("Neha1702#");
        driver.findElement(By.id("js-login-btn")).click();

        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBe(By.xpath("//span[@data-qa=lufexuloga]"),"neha"));

        WebElement username=driver.findElement(By.xpath("//span[@data-qa='lufexuloga']"));
        System.out.println("2" +username.getText());




    }

  @AfterTest
   public void closeBrowser(){
        driver.quit();
   }

}


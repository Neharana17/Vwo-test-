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
import java.util.concurrent.TimeUnit;

public class FindElements {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();

    }

    @Owner("Neha")
    @Test()
   public void testBrowser() throws InterruptedException {
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://app.vwo.com");
        driver.findElement(By.id("login-username")).sendKeys("auto123@inclusion.com");
        driver.findElement(By.id("login-password")).sendKeys("Neha102#");
        driver.findElement(By.id("js-login-btn")).click();


        //Assert Error
        WebElement errormsg= driver.findElement(By.id("js-notification-box-msg"));
        System.out.println("1" +errormsg.getText());

        WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.textToBePresentInElement(errormsg,"Your email, password, IP address or location did not match"));
        System.out.println("2" +errormsg.getText());

    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }

}

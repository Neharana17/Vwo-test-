package org.example.Selenium01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Loginpagewithemai {
    @Test
            public void negativeTc() {
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vwo.com");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement usename=driver.findElement(By.id("login-username"));
        usename.sendKeys("auto123@inclusion.com");

        WebElement password=driver.findElement(By.id("login-password"));
        password.sendKeys("Neha172#");

        WebElement submit=driver.findElement(By.id("js-login-btn"));
        submit.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errormsg =driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(errormsg.getText());

        Assert.assertEquals(errormsg.getText(),"Your email, password, IP address or location did not match");


     driver.quit();
    }
}

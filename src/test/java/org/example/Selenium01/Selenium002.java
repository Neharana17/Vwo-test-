package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Selenium002 {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();

    }

    @Owner("Neha")
    @Test()
    public void testBrowser()  {
// use this select by chossing optin
//        driver.get("https://the-internet.herokuapp.com/dropdown");
//        driver.manage().window().maximize();
//        WebElement element= driver.findElement(By.id("dropdown"));
//        Select select= new Select(element);
//        select.selectByVisibleText("Option 2");

//        // use by
//         driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//         //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click();
//        //driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button")).click();
//       driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
//
//        Alert alert= driver.switchTo().alert();
////        String alertText= alert.getText();
////        System.out.println(alertText);
//
//        alert.sendKeys("neha");
//        alert.accept();
//        String result= driver.findElement(By.id("result")).getText();
//        System.out.println(result);
         /// Checkbox how to get

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        List<WebElement> allcheckboxes= (List<WebElement>) driver.findElement(By.cssSelector("<input type=\"checkbox\"]"));

     for (WebElement checkbox :allcheckboxes){
         if(checkbox.isSelected()){
             checkbox.click();
         }
     }
    }

    @AfterTest
    public void closeBrowser(){
     //   driver.quit();
    }

}


package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

public class Windowhandle {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();


    }

    @Owner("Neha")
    @Test
    public void test() throws InterruptedException {
        String URL = "https://the-internet.herokuapp.com/windows";
        driver.get(URL);
        String mainwindowhandle= driver.getWindowHandle();

        WebElement link= driver.findElement(By.linkText("Click Here"));
        link.click();

        // store and handle all windows

        Set<String> windowhandles= driver.getWindowHandles();


        // ITRATE THE WINDOW
        for(String handle :windowhandles){
            driver.switchTo().window((handle));
                if(driver.getPageSource().contains("New Window")){
                    System.out.println("We found the child window and its opened");
                    break;
                }
            }
        }



    @AfterTest
    public void closeBrowser () {

        // driver.quit();
    }
}






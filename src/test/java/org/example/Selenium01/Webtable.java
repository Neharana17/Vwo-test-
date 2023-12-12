package org.example.Selenium01;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Webtable {
    WebDriver driver;

    @BeforeTest
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/webtable1.html");
    }

    @Owner("Neha")
    @Test
    public  void  test(){
     WebElement table = driver.findElement(By.xpath("//table[@summary='Sample Table']/tbody"));
        List<WebElement> rows_table= table.findElements(By.tagName("tr"));

        for(int i=0;i< rows_table.size();i++){
            List<WebElement> col_table=rows_table.get(i).findElements(By.tagName("td"));
            for(WebElement element:col_table){
                System.out.println(element.getText());
            }
        }
    }
}

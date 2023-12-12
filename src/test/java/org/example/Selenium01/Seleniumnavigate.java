package org.example.Selenium01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Seleniumnavigate {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://bing.com");


        driver.navigate().to("https://app.vwo.com");
        driver.navigate().to(new URL("https://google.com"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();



        driver.quit();
    }
}

package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class tut1task4 {

    WebDriver driver;
    @BeforeMethod
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver= new ChromeDriver();
    }
    @Test
    public void testng(){
        driver.get("https://www.google.com");
    }
}
package com.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qn2_2 {
    public static void main(String[] args) {
        
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver3=new FirefoxDriver();
        driver3.get("https://www.google.com/");
        driver3.close();
    }
}


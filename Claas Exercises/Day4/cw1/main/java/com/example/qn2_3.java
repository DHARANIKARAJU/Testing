package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class qn2_3 {

    public static void main(String[] args) {
       
        WebDriverManager.edgedriver().setup();
        WebDriver driver2=new EdgeDriver();
        driver2.get("https://www.google.com/");
        driver2.close();
        
    }
}


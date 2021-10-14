package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {


    public static void main(String[] args) {
        System.out.println("Hello World");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);



        System.out.println("end");

    }


}

package com.sdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {

    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\OneDrive\\Desktop\\chromedriver.exe");

 
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Page title is :" + driver.getTitle());

        try {
            driver.wait(1000);
        } catch (InterruptedException e) {
          
            e.printStackTrace();
        }
        driver.quit();


    }
    
}

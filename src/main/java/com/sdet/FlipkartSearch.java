package com.sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSearch {

    public static void main(String[] args) {
        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Hp\\OneDrive\\Desktop\\chromedriver.exe");

        // Create an instance of ChromeDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open Flipkart website
            driver.get("https://www.flipkart.com");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Close the login popup if it appears
            try {
                WebElement closeButton = driver.findElement(By.xpath("//button[contains(text(),'✕')]"));
                closeButton.click();
            } catch (Exception e) {
                System.out.println("Login popup did not appear.");
            }

            // Click on the search bar
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.click();

            // Type "Apple MacBook" in the search bar
            searchBox.sendKeys("Apple MacBook");

            // Click on the search button
            WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));
            searchButton.click();

            // Wait for 5 seconds
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
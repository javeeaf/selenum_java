package com.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		 // URL of the login website that is tested
        driver.get("https://www.facebook.com");
  
        // Maximize window size of browser
        driver.manage().window().maximize();
  
        // Enter your login email id
        driver.findElement(By.id("email"))
            .sendKeys("shaik.javeeth786@gmail.com");
  
        // Enter your login password
        driver.findElement(By.id("pass"))
            .sendKeys("Shaik@123");
  
        driver.findElement(By.name("login"))
           .click();
    }
}
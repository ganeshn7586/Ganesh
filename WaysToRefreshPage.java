package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WaysToRefreshPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
//		//1. By navigate command
//		driver.navigate().refresh();
//		Thread.sleep(5000);
//		
//		//2. by using get and current url
//		driver.get(driver.getCurrentUrl());
//		Thread.sleep(5000);
//		
//		//3. by using the get current url and add that into navigate method
//		driver.navigate().to(driver.getCurrentUrl());
//		Thread.sleep(5000);
		
		//4. by using F5 key press
//		Thread.sleep(5000);
		
		
//		driver.findElement(By.id("email")).sendKeys(Keys.F5);
		
		
//		//5. by using ascii value
		Thread.sleep(8000);
		driver.findElement(By.id("email")).sendKeys("\uE035");
		
		

	}

}

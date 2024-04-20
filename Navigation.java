package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		driver.navigate().refresh();
		
		driver.findElement(By.linkText("Flights"));
		Thread.sleep(1000);
		driver.navigate().back();
		
		driver.navigate().forward();
		
		

	}

}

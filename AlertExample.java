package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//1. alert with ok button only
	//	driver.findElement(By.xpath("//*[@id='OKTab']/button")).click();
		
		//2. alert with ok and cancel button
//		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
//		
//		driver.findElement(By.xpath("//*[@id='CancelTab']/button")).click();
//		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='Textbox']/button")).click();
		
		driver.switchTo().alert().sendKeys("Ganesh");
		driver.switchTo().alert().accept();
//		String message =driver.switchTo().alert().getText();
//		System.out.println(message);
		
		
	}

}

package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IsSelectedIsDisplayedIsEnabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement username=driver.findElement(By.id("email"));
		WebElement password=driver.findElement(By.id("pass"));
		
		Boolean result = username.isDisplayed();
		Boolean result1 = username.isEnabled();
		Boolean result2=password.isDisplayed();
		Boolean result3= password.isEnabled();
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		if(username.isDisplayed() && username.isEnabled())
		{
			username.sendKeys("Ganesh");
		}
		if(password.isDisplayed() && password.isEnabled())
		{
			password.sendKeys("Ganesh");
		}
		else
		{
			System.out.println("Password is Incorrect");
		}
		
		WebElement checkbox=driver.findElement(By.id("persist_box"));
		System.out.println(checkbox.isSelected());
	}

}

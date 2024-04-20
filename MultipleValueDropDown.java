package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleValueDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("http://output.jsbin.com/osebed/2");
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s=new Select(fruits);
		if(s.isMultiple())
		{
			s.selectByIndex(0);
			s.selectByValue("apple");
			s.selectByVisibleText("Orange");
			
		
		s.deselectByIndex(0);
		s.deselectByValue("apple");
		s.deselectByVisibleText("Orange");
		
		s.deselectAll();
		}
	}
}

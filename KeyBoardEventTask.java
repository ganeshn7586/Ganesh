package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/text-box");
		
		WebElement current= driver.findElement(By.id("currentAddress"));
		WebElement permanent= driver.findElement(By.id("permanentAddress"));
		
		Actions a = new Actions(driver);
		current.sendKeys("Pune");
		
		// to select all value
		a.keyDown(Keys.CONTROL);
		a.sendKeys("a");
		
		// to release the keys
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		
		// to copy address
		a.keyDown(Keys.CONTROL);
		a.sendKeys("c");
		a.keyUp(Keys.CONTROL);
		a.build().perform();
		
		// using tab switch to next 
		a.keyDown(Keys.TAB).build().perform();
		
		// to paste address
		a.keyDown(Keys.CONTROL);
		a.sendKeys("v");
		a.build().perform();
		
		
		
		
		

	}

}

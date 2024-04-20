package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEventExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/facebook.html");
		WebElement un=driver.findElement(By.id("email"));
		WebElement pass=driver.findElement(By.id("pass"));
		Actions a =new Actions(driver);
		a.keyDown(un, Keys.SHIFT).sendKeys("Ganesh").perform();
		a.keyDown(pass,Keys.SHIFT).sendKeys("Ganesh").perform();
		a.keyDown(Keys.ENTER).perform();

	}

}

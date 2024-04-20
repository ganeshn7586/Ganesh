package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// By Absolute xpath
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.guru99.com/test/facebook.html");
//		WebElement username = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[1]/input"));
//		
//		WebElement password = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[2]/input"));
//		
//		WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div/div/div/div/div[1]/div/div/form/table/tbody/tr[2]/td[3]/label/input"));
//		
		
		// By Relative Xpath // Relative xpath
		
		//1. tag and attributes
//		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
	
//		WebElement password = driver.findElement(By.xpath("input[@id='pass']"));
	
//		WebElement login = driver.findElement(By.xpath("//label[@class='uiButton uiButtonConfirm']"));
	
		//2. with and And attributes
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' and @name='email']"));
//		WebElement pass= driver.findElement(By.xpath("//input[@type='password' and @tabindex='2']"));
//		WebElement login =driver.findElement(By.xpath("//input[@value='Log In' and value='submit']"));
		
		//3. with or and attributes
//		WebElement un = driver.findElement(By.xpath("//input[@id='email' or @name='email']"));
//		WebElement pass= driver.findElement(By.xpath("//input[@type='password'or @tabindex='2']"));
//		WebElement login =driver.findElement(By.xpath("//input[@value='Log In' or value='submit']"));
		
		//4. with contains
//		WebElement un = driver.findElement(By.xpath("//input[contains(@name,'ma')]"));
//		WebElement pass = driver.findElement(By.xpath("//input[contains(@id,'pass')]"));
//		WebElement login = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		
		//5.start with
		WebElement un = driver.findElement(By.xpath("//input[starts-with(@name,'em')]"));
		WebElement pass = driver.findElement(By.xpath("//input[starts-with(@id,'pa')]"));
		WebElement login = driver.findElement(By.xpath("//input[starts-with(@type,'su')]"));

		//6. using text
		WebElement fyp=driver.findElement(By.xpath("//a[text()='Forgot your password?']"));
		un.sendKeys("Ganesh");
		pass.sendKeys("Ganesh");
		login.click();
		//driver.navigate().to("https://demo.guru99.com/test/facebook.html");
		
		//fyp.click();
		
		
		

	}

}

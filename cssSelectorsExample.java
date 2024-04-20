package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		//1. By tagname and class name
		driver.findElement(By.cssSelector(".inputtext")).sendKeys("abc");
		
		//2. By tagname and id
		driver.findElement(By.cssSelector("#pass[type='password']")).sendKeys("abc");
		
		//3.by tagname and attribute
		driver.findElement(By.cssSelector("input[value='Log In'][type='submit'")).click();
		
		//4. by tagname, id and attribute
		//driver.findElement(By.cssSelector("input#persistbox[type='checkbox'][value='1']")).click();
		
		//5. by tagname,class and attributes
		//driver.findElement(By.cssSelector("input.uiInputLabelCheckbox[type='checkbox'][value='1']")).click();
		
		driver.switchTo().defaultContent();
		
		//7. by using start with
		//driver.findElement(By.cssSelector("[name^='em']")).sendKeys("abc");
		
		//8. ends with
		//driver.findElement(By.cssSelector("[type$='ord']")).sendKeys("abc");
		
		//9. contains
		//driver.findElement(By.cssSelector("[type*='bm']")).click();
		driver.quit();
	
	}
	

}

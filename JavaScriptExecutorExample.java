package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://moneyboats.com/");
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
	//	js.executeScript("window.scrollby(0,500)");
		
//		driver.findElement(By.name("uid")).sendKeys("Ganesh");
//		driver.findElement(By.name("password")).sendKeys("Ganesh@123");
		
		//WebElement login = driver.findElement(By.name("btnLogin"));
		// we will use below javascript to click on login button
//		js.executeScript("arguments[0].click();", login);
//		
		//we will use below javascript to handle the alert
//		js.executeScript("alert('User or Password is not valid');");
		
		//we will use below script to get all the detailsof webpage like title, domain name
//		String domainName= js.executeScript("return document.domain;").toString();
//		System.out.println(domainName);
//		
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		String url =js.executeScript("return document.URL;").toString();
//		System.out.println(url);
//		
//		//we will use below javascript to launch the new url
//		js.executeScript("window.location='https://demo.guru99.com/v4/index.php'");
//		
//		//to scroll up and scroll down
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("window.scrollBy(0,-500)");
		
		
		
		
	}

}

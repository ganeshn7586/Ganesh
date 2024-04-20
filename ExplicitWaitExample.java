package com.First;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/facebook.html");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement username=driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("Ganesh");
		
		WebElement password = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("pass")));
		password.sendKeys("Gaesh@123");
		
		WebElement login = driver.findElement(By.id("u_0_b"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
		
		
	}

}
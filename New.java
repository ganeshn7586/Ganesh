package com.First;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class New {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://eartistauat.knowzieslmsdev.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		WebElement accept = driver.findElement(By.xpath("/html/body/app-root/app-cookie-consent/div[1]/div[2]/button[2]"));
		wait.until(ExpectedConditions.visibilityOf(accept));
		accept.click();
		
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='mat-input-0']"));
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Admin@123");
		
		WebElement login = driver.findElement(By.xpath("//button[@value='Login']"));
		login.click();

	}

}

package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		
		WebElement upload = driver.findElement(By.id("uploadfile_0"));
		upload.sendKeys("D:\\Ganesh\\Personal Documents\\Photo.jpg");
		
		WebElement button = driver.findElement(By.id("submitbutton"));
		button.click();

	}

}

package com.First;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;



public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\chromedriver-win64\\chromedriver.exe");
		driver.get("https://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		// take screenshot
		TakesScreenshot ts= (TakesScreenshot) driver;
		
		//taking screenshot into file
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//copying to new file
		Files.copy(src, new File("D://screen.png"));
	}

}

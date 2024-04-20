package com.First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethodPratical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getCurrentUrl());
		driver.getTitle();
		System.out.println(driver.getTitle());
		driver.getCurrentUrl();
	    String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		System.out.println(driver.getPageSource());
		
		// to close all the openendcon url or tabs on browser
		//driver.quit();
		
		//to close the current url 
		driver.close();
		

	}

}

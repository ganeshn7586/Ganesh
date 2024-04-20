package com.First;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandlesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Tabbed\"]/a/button"));
		button.click();
		
		Set<String> childWindow =driver.getWindowHandles();
		Iterator<String> it = childWindow.iterator();
		while(it.hasNext())
		{
			String childwindow1 = it.next();
			System.out.println(childwindow1);
			if(!parentWindow.equalsIgnoreCase(childwindow1))
			{
				driver.switchTo().window(childwindow1);
				WebElement download = driver.findElement(By.linkText("Downloads"));
				download.click();
				driver.close();
			
			}
			
		}
		driver.switchTo().window(parentWindow);
		
		
	}

}

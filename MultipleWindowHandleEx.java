package com.First;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		WebElement button = driver.findElement(By.xpath("//*[@id='Multiple']/button"));
		button.click();
		
		Set<String> childWindows = driver.getWindowHandles();
		Iterator<String> it = childWindows.iterator();
		while(it.hasNext())
		{
			String childWindow = it.next();
			if(!parentWindow.equalsIgnoreCase(childWindow))
			{
				driver.switchTo().window(childWindow);
				if(driver.getTitle().equalsIgnoreCase("Selenium"))
				{
				
					WebElement download = driver.findElement(By.linkText("Downloads"));
					download.click();
					driver.close();
				}
				else
				{
					WebElement image = driver.findElement(By.id("enterimg"));
					image.click();
					
					driver.close();
				}
				
				
			}
		}

	}

}

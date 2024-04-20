package com.First;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleIFrameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		List<WebElement> count=driver.findElements(By.tagName("iframe"));
		int size =count.size();
		System.out.println("No of Frames are : "+size);
		
		//driver.switchTo().frame(1);
		driver.switchTo().frame("SingleFrame");
		WebElement text=driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/input[1]"));
		text.sendKeys("Ganesh");
		
		
		

	}

}

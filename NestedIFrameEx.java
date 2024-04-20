package com.First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedIFrameEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		WebElement button = driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]"));		
		button.click();
		
		WebElement parentIFrame = driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		driver.switchTo().frame(parentIFrame);
		
		WebElement text = driver.findElement(By.xpath("/html/body/section/div/div/h5"));
		String value = text.getText();
		System.out.println(value);
		
//		WebElement childIFrame = driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//		driver.switchTo().frame(childIFrame);
		
		driver.switchTo().frame(0);
		
//		WebElement childText = driver.findElement(By.xpath("/html/body/section/div/h5"));
//		String value2 = childText.getText();
//		System.out.println(value2);
		
		WebElement data = driver.findElement(By.xpath("/html/body/section/div/div/div/input"));
		data.sendKeys("Ganesh");
		//driver.close();
		
		driver.switchTo().defaultContent();
	}

}

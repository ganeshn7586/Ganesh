package com.First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://only-testing-blog.blogspot.com/");
//		WebElement button=driver.findElement(By.xpath("//*[@id=\"post-body-7297556448793668582\"]/div[1]/button"));
		Actions a =new Actions(driver);
//		a.doubleClick(button).perform();
//		driver.switchTo().alert().dismiss();
		
		driver.findElement(By.linkText("Drag and Drop")).click();
//		
		WebElement src= driver.findElement(By.id("dragdiv"));
		WebElement target= driver.findElement(By.id("dropdiv"));
		//a.dragAndDrop(src, target).perform();
		a.clickAndHold(src).release(target).perform();
		a.dragAndDropBy(src, 100,100).perform();
	}

}

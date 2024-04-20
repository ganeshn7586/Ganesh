package com.First;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/Register.html");
		// to select single checkbox
//		WebElement checkbox1=driver.findElement(By.id("checkbox1"));
//		if(checkbox1.isSelected()==false)
//		checkbox1.click();
//		System.out.println(checkbox1.isSelected());
//		List<WebElement> checkboxlist =driver.findElements(By.cssSelector("input[type='checkbox']"));
//		for(WebElement list:checkboxlist)
//		{
//			list.getText();
//		}
		
		//To select multiple checkbox
//		List<WebElement> cb =driver.findElements(By.cssSelector("input[type='checkbox']"));
//		int size = cb.size();
//		cb.get(0).click();
//		for(WebElement list:cb)
//			{
//				list.click();
//			}
		
//		for(int i=0;i<size;i++)
//		{
//			cb.get(i).click(); // to select all checkboxes
//			
//		}
//		
		List<WebElement> cb =driver.findElements(By.cssSelector("input[type='checkbox']"));
		int size = cb.size();
		for(int i=0;i<size;i++)
			{
				String value = cb.get(i).getAttribute("value");
				if(value.equalsIgnoreCase("Cricket"))
				cb.get(i).click(); // to select all checkboxes
				
			}
		
	}

}

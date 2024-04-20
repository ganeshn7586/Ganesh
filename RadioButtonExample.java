package com.First;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement male=driver.findElement(By.cssSelector("input[value='Male']"));
		// WebElement female=driver.findElement(By.cssSelector("input[value='FeMale']"));
		if(male.isSelected())
			System.out.println("Radio Button is selected");
		else
			male.click();
		List<WebElement> rb=driver.findElements(By.cssSelector("input[type='radio']"));
		int size =rb.size();
		for(WebElement list:rb )
		{
			System.out.println(list.getAttribute("value"));
		}
		for(int i=0;i<size;i++)
		{
			String value=rb.get(i).getAttribute("value");
			if(value.equalsIgnoreCase("Male"))
				rb.get(i).click();
			
		}
	}

}

package com.First;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\Software\\Chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> columns=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		int size = columns.size();
	
		
		for(int i=0;i<size;i++)
		{
			String columnName=columns.get(i).getText();
			System.out.println(columnName);
			if(columnName.equalsIgnoreCase("Company"))
			{
				System.out.println("We have column name as per requirements");
			}
		}
		
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		int size2=rows.size();
		System.out.println(size2);
		for(int i=0;i<size2;i++)
		{
			String rowName=rows.get(i).getText();
			System.out.println(rowName);
		}
		
		WebElement cell =driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr[6]/td[2]"));
		System.out.println(cell.getText());
		
	}

}

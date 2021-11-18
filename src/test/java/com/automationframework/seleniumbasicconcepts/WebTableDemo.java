package com.automationframework.seleniumbasicconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://seleniumpractise.blogspot.com/2021/08");
		
		List<WebElement> elements=driver.findElements(By.xpath("//table[contains(@id, 'custo')]//tr/th"));
		
		for(WebElement ele:elements)
		{
			
			String value=ele.getText();
			System.out.println(value);
		}
		
	List<WebElement> tablerows=	driver.findElements(By.xpath("//table[contains(@id,'custo')]/tbody/tr"));
	
	for(WebElement tabledata:tablerows)
	{
		System.out.println(tabledata.getText());
	}
		
		
	}

}

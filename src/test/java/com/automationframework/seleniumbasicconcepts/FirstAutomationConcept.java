package com.automationframework.seleniumbasicconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomationConcept {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\EveningBatch\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://github.com/login");
		 driver.manage().window().maximize();
		 
		String headerName=driver.findElement(By.tagName("h1")).getText();
		System.out.println("Git Hub login page header "+headerName);
		 
		 Thread.sleep(2000);
		 driver.close();
		 
	}

}

package com.automationframework.seleniumbasicconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SyncronizationClasses {

	public static void implicityWaitConcept() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		/*
		 * driver.findElement(By.id("btn1")).click();
		 * driver.findElement(By.xpath("(//button[@id='btn1']/following::h3/input)[1]"))
		 * .sendKeys("MR Training");
		 */
		
		Thread.sleep(1000);
		
		driver.findElement(By.id("btn2")).click();
		
		driver.findElement(By.xpath("(//button[@id='btn2']/following::h3/input)[2]")).sendKeys("Evening Batch");
		
		
		
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		implicityWaitConcept();
	}

}

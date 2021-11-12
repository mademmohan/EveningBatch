package com.automationframework.seleniumbasicconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingConcept {
	WebDriver driver;
	
	
	public void setUp() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		WebElement textbox=driver.findElement(By.className("frmTextBox"));
		textbox.sendKeys("FirstTime");
		WebElement frame1=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(frame1);
		WebElement courseslist=driver.findElement(By.id("course"));
		Thread.sleep(2000);
		Select course= new Select(courseslist);
		course.selectByVisibleText("Java");
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		textbox.clear();
		Thread.sleep(2000);
		textbox.sendKeys("Second Time");
		Thread.sleep(2000);
		driver.switchTo().frame(frame1);
		course.selectByIndex(3);
		driver.switchTo().defaultContent();
		textbox.clear();
		Thread.sleep(2000);
		textbox.sendKeys("Third Time");
		
	}
	
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		FramesHandlingConcept frames= new FramesHandlingConcept();
		frames.setUp();
		frames.tearDown();
	}

}

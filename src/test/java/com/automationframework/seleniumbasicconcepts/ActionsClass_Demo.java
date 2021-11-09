package com.automationframework.seleniumbasicconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClass_Demo {

	WebDriver driver;
	Actions action;
	Alert alert;

	public ActionsClass_Demo() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();
	}

	public void moveToElement() throws InterruptedException {

		driver.get("https://www.google.co.in/");

		Thread.sleep(2000);

		action = new Actions(driver);

		WebElement gmaillink = driver.findElement(By.linkText("Gmail"));

		action.moveToElement(gmaillink).click().perform();

		Thread.sleep(2000);

	}

	public void doubleClickPractice() {

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleclickbutton = driver.findElement(By.tagName("button"));

		action = new Actions(driver);
		action.doubleClick(doubleclickbutton).perform();

		alert = driver.switchTo().alert();
		alert.accept();

	}

	public void rightClickPractice() throws InterruptedException {
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		action = new Actions(driver);
		action.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Delete']")).click();
	}

	public void teardown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		ActionsClass_Demo ref = new ActionsClass_Demo();
		ref.rightClickPractice();
		ref.teardown();

	}

}

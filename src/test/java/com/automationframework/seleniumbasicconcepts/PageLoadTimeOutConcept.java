package com.automationframework.seleniumbasicconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageLoadTimeOutConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(-5, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");

		// By default selenium will take 300 sec to wait page.

		System.out.println("Title of the page ::" + driver.getTitle());
	}

}

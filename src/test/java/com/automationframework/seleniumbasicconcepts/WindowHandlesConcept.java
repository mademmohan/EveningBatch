package com.automationframework.seleniumbasicconcepts;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlesConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://courses.letskodeit.com/practice");
		String parentwindow = driver.getWindowHandle();
		driver.findElement(By.id("opentab")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for (String window : allwindows) {
			driver.switchTo().window(window);// parent
			if (driver.getTitle().equalsIgnoreCase("All Courses")) {

				driver.findElement(By.xpath("//div[@class='zen-course-list']/a[@href='/courses/selenium-webdriver-advanced']")).click();
				break;
			}

		}
		driver.switchTo().window(parentwindow);
		Thread.sleep(2000);
		driver.findElement(By.id("openwindow")).click();
	}

}

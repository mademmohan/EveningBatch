package com.automationframework.seleniumbasicconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsConcepts {
	static WebDriver driver;
	static Alert alert;

	public static void simpleAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\EveningBatch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("alertBox")).click();

		alert = driver.switchTo().alert();
		System.out.println("Text on Alert ::" + alert.getText());
		Thread.sleep(2000);
		alert.accept();

	}

	public static void confirmationAlert() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\EveningBatch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("confirmBox")).click();

		alert = driver.switchTo().alert();
		alert.dismiss();
		
		String alertoutput=driver.findElement(By.id("output")).getText();
		System.out.println("Pressed button "+alertoutput);

	}

	public static void main(String[] args) {
		try {

			confirmationAlert();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

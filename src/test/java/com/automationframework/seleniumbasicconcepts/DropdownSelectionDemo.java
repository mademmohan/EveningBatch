package com.automationframework.seleniumbasicconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectionDemo {
	WebDriver driver;
	Select courseName;
	Select idevalues;

	public void dropDownSelection() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\EveningBatch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.id("course"));

		courseName = new Select(dropdown);

		courseName.selectByIndex(2);// Dot Net

		Thread.sleep(2000);

		courseName.selectByValue("js");

		Thread.sleep(2000);

		courseName.selectByVisibleText("Python");

		Thread.sleep(3000);

		List<WebElement> allcourselist = courseName.getOptions();

		for (WebElement course : allcourselist) {
			System.out.println("My courses are " + course.getText());
		}

	}

	public void fistSelectedOption() {
		WebElement courseSelected = courseName.getFirstSelectedOption();
		System.out.println("First Selected Option ::" + courseSelected.getText());
	}

	public void multiSelectionDropDown() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\EveningBatch\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();  
		
		WebElement Ide_Names=driver.findElement(By.id("ide"));
		
		idevalues= new Select(Ide_Names);
		
		idevalues.selectByIndex(1);
		 
		Thread.sleep(2000);
		
		idevalues.selectByValue("vs");
		
		idevalues.selectByVisibleText("NetBeans");
		
		Thread.sleep(1000);
		
		idevalues.deselectByIndex(1);
		
		List<WebElement> allselectoptions=idevalues.getAllSelectedOptions();
		
		for(WebElement options:allselectoptions)
		{
			System.out.println(options.getText());
		}
		
		
	}

	public void tearDown() throws InterruptedException {
		Thread.sleep(1000);
		driver.close();
	}

	public static void main(String[] args) {

		DropdownSelectionDemo demo = new DropdownSelectionDemo();
		try {
			demo.multiSelectionDropDown();
			demo.tearDown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}

package com.automationframework.seleniumbasicconcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsCheckBox {

	WebDriver driver;

	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void radioButtonsValidation() throws InterruptedException {
		driver.get("https://courses.letskodeit.com/practice");
		WebElement bmwradiobutton = driver.findElement(By.xpath("//input[@id='bmwradio' ]"));

		WebElement hondaRadioButton = driver.findElement(By.xpath("//input[@id='hondaradio']"));

		WebElement benzRadioButton = driver.findElement(By.xpath("//input[@id='benzradio']"));

		bmwradiobutton.click();

		System.out.println("Is bmw radio button selected ::" + bmwradiobutton.isSelected());

		System.out.println("Is benz radio button selected ::" + benzRadioButton.isSelected());

		System.out.println("Is honda radio button selected ::" + hondaRadioButton.isSelected());

	}

	public void checkBoxValidation() throws InterruptedException {
		driver.get("https://courses.letskodeit.com/practice");

		WebElement bmwcheckbox = driver.findElement(By.xpath("//input[@id='bmwcheck']"));

		WebElement benzcheckbox = driver.findElement(By.xpath("//input[@id='benzcheck']"));

		WebElement hondacheckbox = driver.findElement(By.xpath("//input[@id='hondacheck']"));

		hondacheckbox.click();
		
		Thread.sleep(2000);

		if (!bmwcheckbox.isSelected())// If it selected state mode return true, return
		{
			bmwcheckbox.click();
		}
		Thread.sleep(2000);

		if (!benzcheckbox.isSelected()) {
			benzcheckbox.click();
		}
		Thread.sleep(2000);

		if (!hondacheckbox.isSelected()) {
			hondacheckbox.click();
		} else {
			System.out.println("Already selected for honda checkbox");
		}
	}
	
	public void dynamicRadioBoxSelection(String myselection)
	{
		driver.get("https://courses.letskodeit.com/practice");
		
		 List<WebElement> cars =driver.findElements(By.xpath("//input[@type='radio']"));
		 
		 for(WebElement eachcar:cars)
		 {
			 System.out.println(eachcar.getAttribute("id"));
			  
			 if(eachcar.getAttribute("id").equals(myselection))//false, false, 
			 {
				 eachcar.click();
				 break;
			 }
		 }
	}

	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		RadioButtonsCheckBox ref = new RadioButtonsCheckBox();  //ClassName ref= new ClassName
		ref.setUp();
		ref.dynamicRadioBoxSelection("bmwradio");

		ref.tearDown();
	}

}

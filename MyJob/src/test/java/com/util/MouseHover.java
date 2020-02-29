package com.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws IOException {

		
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		Actions ac = new Actions(driver);
		WebElement mainlist=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		WebElement takelist=driver.findElement(By.xpath("//span[contains(text(),'Baby Registry')]"));
		ac.moveToElement(mainlist).moveToElement(mainlist).click().build().perform();
		Screenshot.Shot(driver, "Baby Registry");
	}

}

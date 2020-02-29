package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
WebDriver driver= new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
driver.getTitle();




WebElement rd =driver.findElement(By.xpath("//input[@id='u_0_7']"));
rd.click();

boolean a=rd.isSelected();
System.out.println(a);
boolean b=rd.isDisplayed();
System.out.println(b);
boolean c=rd.isEnabled();
System.out.println(c);



}}
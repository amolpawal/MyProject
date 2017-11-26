package com.qedge.demos;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DemoAlerts 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("https://irctc.co.in");		
		driver.findElement(By.linkText("Flights")).click();
		
		Set<String> allwindows=driver.getWindowHandles();		
		Object[] windows= allwindows.toArray(); 
		String window1=windows[0].toString();
		String window2=windows[1].toString();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("origin")).sendKeys("Hyd");		
		driver.switchTo().window(window1);		
		driver.findElement(By.linkText("Tourism")).click();
	}

}

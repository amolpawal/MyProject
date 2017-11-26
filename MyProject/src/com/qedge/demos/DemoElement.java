package com.qedge.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class DemoElement 
{

	
	public static void main(String[] args) 
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redbus.in/");	
	driver.findElement(By.id("src")).sendKeys("Hyd");

	
	List<WebElement> cities;
	cities=driver.findElements
			         (By.xpath("//section/div/div[1]/div/ul/li"));
	System.out.println(cities.size());
	
	for (int i = 0; i < cities.size(); i++) 
	{
		String cityname=cities.get(i).getText();
		System.out.println(cityname);
	}
	
	
	
		
		

		
	}

}

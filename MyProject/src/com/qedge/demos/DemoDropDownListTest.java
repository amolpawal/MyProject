package com.qedge.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDownListTest 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/list1.html");
		
		Select demolist=new Select(driver.findElement(By.id("demo")));
		
		List<WebElement> dlist=demolist.getOptions();
		
		boolean ordered=true;		
		for (int i = 1; i < dlist.size(); i++) 
		{
			String str1=dlist.get(i-1).getText();
			String str2=dlist.get(i).getText();
			
			if (str2.compareToIgnoreCase(str1)<0) 
			{
				ordered=false;
				break;
			}			
		}
		if (ordered) 
		{
			System.out.println("Values are in Order, Test Pass");
		} else 
		{
			System.out.println("Values are not in Order, Test Fail");
		}
		
		
   

	}

}

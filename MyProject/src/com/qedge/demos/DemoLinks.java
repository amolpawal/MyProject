package com.qedge.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class DemoLinks 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://money.rediff.com/tools/forex");
		
		WebElement currtable;
		currtable=driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows;
		rows=currtable.findElements(By.tagName("tr"));
		System.out.println(rows.size());		
	}

}

package com.qedge.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalTest 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com");		
		driver.findElement(By.id("DepartDate")).click();
		
		String doj="8/January/2019";
		String[] temp=doj.split("/");
		
		String dt,month,year;
		dt=temp[0];
		month=temp[1];
		year=temp[2];
		
		String calyear,calmonth,caldt;
		calyear=driver.findElement(By.className("ui-datepicker-year"))
															.getText();
		
		while (!calyear.equals(year)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calyear=driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		while (!calmonth.equalsIgnoreCase(month)) 
		{
			driver.findElement(By.className("nextMonth ")).click();
			calmonth=driver.findElement(By.className("ui-datepicker-month")).getText();
		}
		
		WebElement cal;
		cal=driver.findElement(By.className("calendar"));
		
		List<WebElement> rows,cols;
		rows=cal.findElements(By.tagName("tr"));
		for (int i = 1; i < rows.size(); i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < cols.size(); j++) 
			{
				caldt=cols.get(j).getText();
				if (caldt.equals(dt)) 
				{
					cols.get(j).click();
				}
			}
		}
		
		
	}

}

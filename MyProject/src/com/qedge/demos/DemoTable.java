package com.qedge.demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTable 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']")).click();
		
		WebElement emptable;
		emptable=driver.findElement(By.id("DGBanker"));
		
		List<WebElement> rows,cols;
		rows=emptable.findElements(By.tagName("tr"));
		
		for (int i = 1; i < rows.size()-1; i++) 
		{
			cols=rows.get(i).findElements(By.tagName("td"));
			String empno=cols.get(0).getText();
			String empname=cols.get(1).getText();
			System.out.println(empno+" "+empname);
		}

	}

}

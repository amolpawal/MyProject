package com.qedge.demos;


import java.util.List;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoListTest 
{

	public static void main(String[] args) 
	{
		String expbranch,actbranch;
		expbranch="Madhapur";	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement blistelement;
		blistelement=driver.findElement(By.id("drlist"));
		
		Select blist=new Select(blistelement);
		List<WebElement> branchlist=blist.getOptions();
		
		boolean brexist=false;		
		for (int i = 1; i < branchlist.size(); i++) 
		{
			actbranch=branchlist.get(i).getText();			
			if (expbranch.equalsIgnoreCase(actbranch)) 
			{
				brexist=true;
				break;
			}			
		}
		
		if (brexist) 
		{
			System.out.println(expbranch+" is Present, Test Pass");
		} else 
		{
			System.out.println(expbranch+" is not Present, Test Fail");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}

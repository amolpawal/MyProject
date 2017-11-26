package com.primusbank.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.primusbank.constants.PrimusBankConstants;

public class Primusbankhomepage extends PrimusBankConstants
{
	
	
	public String adminuid;
	public String adminpwd;
	public String branchname,bankeruid,bankerpwd; 
	
	
	
		
	public boolean adminLogin(String uid,String pwd)
	{
		String expurl,acturl;
		expurl="adminflow";
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}		
	}
	
	public boolean bankerLogin(String brname,String uid,String pwd)
	{
		String expurl,acturl;
		expurl="Bankers_flow";
		WebElement blistelement;
		blistelement=driver.findElement(By.id("drlist"));
		Select blist=new Select(blistelement);
		blist.selectByVisibleText(brname);
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		driver.findElement(By.id("login")).click();
		acturl=driver.getCurrentUrl();
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	
	public boolean navigateToSitemap()
	{
		driver.findElement(By.linkText("Site Map"));
		if (driver.findElement(By.xpath("//table/tbody/tr[5]/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td")).getText().equalsIgnoreCase("Sitemap")) 
		{
			return true;
		} else 
		{
			return false;
		}
	}
	
	
	
	
	
	
	
	
	
	
}

package com.qedge.demos;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class EmpRegTest 
{

	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys("Richards");
		driver.findElement(By.id("lastName")).sendKeys("demo");
		driver.findElement(By.id("photofile")).click();
		
		Runtime.getRuntime().exec("d:\\fileupload.exe");
		Sleeper.sleepTightInSeconds(5);		
		driver.findElement(By.id("btnSave")).click();
	}

}

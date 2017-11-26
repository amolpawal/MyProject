package com.qedge.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoKBMouseTest
{

	public static void main(String[] args) 
	{
	
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement
				                     (By.className("demo-frame")));
		driver.findElement(By.id("draggable"));
		
		Actions act=new Actions(driver);
		
		WebElement srcelement,trgelement;
		srcelement=driver.findElement(By.id("draggable"));
		trgelement=driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(srcelement, trgelement);
		act.build().perform();
		
		
	}

}

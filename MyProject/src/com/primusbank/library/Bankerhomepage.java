package com.primusbank.library;

import org.openqa.selenium.By;

import com.primusbank.constants.PrimusBankConstants;

public class Bankerhomepage extends PrimusBankConstants
{
  public void bankerLogout()
  {
	  driver.findElement(By.id("IMG1")).click();
  }
  
  
}

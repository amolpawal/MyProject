package com.primusbank.tests;

import org.testng.annotations.Test;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.AdminHomePage;
import com.primusbank.library.Primusbankhomepage;

public class AdminLoginTest extends PrimusBankConstants
{	
	@Test
	public void adminTest() 
	{
		boolean res;	
				
		Primusbankhomepage phome=new Primusbankhomepage();
		phome.adminuid="Admin";
		phome.adminpwd="Admin";
		res=phome.adminLogin(phome.adminuid, phome.adminpwd);
		if (res) 
		{
			System.out.println("Admin Login Test Pass");
		} else 
		{
			System.out.println("Admin Login Test Fail");
		}
		
		AdminHomePage ahome=new AdminHomePage();
		ahome.adminLogout();
	
	}

}

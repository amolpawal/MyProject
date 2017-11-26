package com.primusbank.tests;

import com.primusbank.constants.PrimusBankConstants;
import com.primusbank.library.Bankerhomepage;
import com.primusbank.library.Primusbankhomepage;
import com.qedge.demos.LaunchApp;

public class BankerLoginTest extends PrimusBankConstants{

	
	public static void main(String[] args) 
	{
		boolean res;
		
		Primusbankhomepage phome=new Primusbankhomepage();
		phome.branchname="Ameerpet";
		phome.bankeruid="Richards";
		phome.bankerpwd="demo";
		res=phome.bankerLogin(phome.branchname, phome.bankeruid, phome.bankerpwd);
		if(res)
		{
			System.out.println("Banker Login Test Pass");
		}else
		{
			System.out.println("Banker Login TEst Fail");
		}
		Bankerhomepage bhome=new Bankerhomepage();
		bhome.bankerLogout();		

	}

}

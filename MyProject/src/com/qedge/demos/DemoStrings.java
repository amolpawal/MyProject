package com.qedge.demos;

public class DemoStrings
{

	public static void main(String[] args) 
	{
		String[] clist=new String[3];
		
		clist[0]="chennai";
		clist[1]="banglore";
		clist[2]="Hyderabad";
		
		System.out.println(clist.length);
		
		for (int i = 0; i < clist.length; i++) 
		{
			String cname=clist[i];
			System.out.println(cname);			
		}
		
	}

}

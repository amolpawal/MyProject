package com.qedge.demos;

public class LaunchApp 
{

	
	public static void main(String[] args) 
	{
		char course='s';		
		switch (course) 
		{
		case 's':
			System.out.println("Selenium");
			break; 
			
		case 'q':
			System.out.println("QTP");
			break;
		case 'l':
			System.out.println("LoadRunner");
			break;			
		default:
			System.out.println("Not Selenium/QTP/LoadRunner");
			break;
		}
					
	}

}

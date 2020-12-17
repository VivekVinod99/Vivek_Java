package myPackage1;

import java.util.*;


class CustomException extends Exception		//userdefined exception
{	 
	public CustomException(String message)
	{
		super(message);		// call the constructor of parent Exception
	    
	  }
}


public class Login
{	
		public void login()		//function login
		{

		ArrayList<String> list =new ArrayList<String>();
        	list.add("vivek");
        	list.add("vivek");

	
		if(list.contains(null))
		{
		System.out.println("No User Avilable");
		}

		else
		{
		
		String username,password;	
		
		Scanner login_scan =new Scanner(System.in);
		System.out.println("Enter UserName: ");
		username=login_scan.nextLine();
		System.out.println("Enter PassWord: ");
		password=login_scan.nextLine();
		if(username.equals(list.get(0)) && password.equals(list.get(1)))
		{
			System.out.println("Logging In!");

		}
		else 
		{
			System.out.println("The Username or PAssword is incorrect, Please try again!!");	
			login();
		}

		}

	}
}  
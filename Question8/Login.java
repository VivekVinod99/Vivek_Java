package myPackage1;

import java.util.*;

public class Login
{	
		public void login()		//function login
		{

		Scanner sc = new Scanner(System.in);
		String pass;
		String user;

		System.out.println("Enter user name: ");
		user=sc.next();
		System.out.println("Enter password: ");
		pass =sc.next();

		if(user.equals("vivek") && pass.equals("vivek"))
		{
 			System.out.println("Login Successfully ");
		}
		else
		{
			System.out.println("Wrong username and password!");
			System.exit(0);
		}
	
	}
}  
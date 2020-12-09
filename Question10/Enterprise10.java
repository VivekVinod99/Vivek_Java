import java.util.*;		//user defined package

import myPackage.*;	//import 'MyClass' class from myPackage
import myPackage1.*;	//import 'Login' class from myPackage1


interface gst
{
	final int g = 18;
	void display();
}

class Stock implements gst 	//class that implements the interface
{
	Scanner sc = new Scanner(System.in);	

	public void read()
	{
	System.out.println("\nEnter 1 for adding stock");
	System.out.println("Enter 0 to exit");
		
	int choice=sc.nextInt();
			
	switch(choice)
	{
	case 0:
		System.exit(0);
		break;

	case 1:
		add_stock();
		break;

	default:
		System.out.println("Wrong Choice!\n");
		read();		
	}
	}

	public int product_id[];
	public String name[];
	public int qty[];
	public int price[];
	int i=0;
	int num=0;


	public void add_stock()
	{
		//System.out.println("You have entered one");
		System.out.println("Enter the number of products you wants to enter: ");
		num=sc.nextInt()+1;
		
		product_id = new int[num];
		name= new String[num];
		qty = new int[num];
		price = new int[num];
		

		product_id[0] = 1000;
		name[0] = "Rackets";
		qty[0] = 77;
		price[0] = 850;

		for(i = 1; i < num; i++)
		{
			System.out.println("");
			System.out.printf("Enter product Details  ");
			System.out.println("");

			System.out.println("Enter product_id: ");
			product_id[i]=sc.nextInt();

			System.out.println("Enter Product Name: ");
			name[i]=sc.next();

			System.out.println("Enter Product Quantity: ");
			qty[i]=sc.nextInt();

			System.out.println("Enter Price of Product: ");
			price[i]=sc.nextInt();	
		}		
	}




	public void display()		//Implementing the Interface
	{
	System.out.println("Product_Id	" + "Name	" + "Quantity	" + "Price	" + "GST");
	for(int i = 1;i < num;i++)
	{
		System.out.println("---------------------------------------------");

		System.out.println(product_id[i] + "		" + name[i] + "		" + price[i] + "	" + qty[i] + "	" + g);
	}
	}
}

class Enterprise10 extends Thread implements Runnable
{
	public void run()
	{
		System.out.println("The Thread has benn ended");
	}
	
	public static void main(String args[])
	{
     try
	{ 	 
		myPackage1.Login ln = new myPackage1.Login();			//Creating an instance of class Login
		ln.login();
	
		Stock st = new Stock();

		myPackage.MyClass obj = new myPackage.MyClass();		//Creating an instance of class MyClass
		obj.project_name();

		st.add_stock();
		
		Enterprise10 thread = new Enterprise10();
		thread.start();
		while(thread.isAlive())
		{
			System.out.println("Please Wait, Table is being created");
		}
		
		
		st.display();
		
	}
	catch (Exception e)
	{
		System.out.println("["+e+"] There is an Exception");
	}
	finally
	{
		System.out.println("Thank you for using this Management system");
	}
	}
}
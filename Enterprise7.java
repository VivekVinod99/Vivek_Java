//Q7

import java.util.*;
import java.util.Scanner;

abstract class start
{
	abstract void add_stock();
}

class Stock extends start
{
	Scanner sc = new Scanner(System.in);	
	final int g = 18;

	void hello()
	{
		System.out.println("Super Class");
	}

	public int product_id[];
	String name[];
	int qty[];
	int price[];
	int i=0,num=0;
	
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

	void add_stock()
	{
		System.out.println("You have entered one");
		System.out.println("Enter the number of products you wants to enter: ");
		num=sc.nextInt()+1;
		
		product_id = new int[num];
		name= new String[num];
		qty = new int[num];
		price = new int[num];
		

		product_id[0] = 1000;
		name[0] = "Keyboard";
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


	public void display()
	{
	System.out.println("Product_Id	" + "Name	" + "Quantity	" + "Price	" + "GST");
	for(i = 1;i < num;i++)
	{
		System.out.println("---------------------------------------------");

		System.out.println(product_id[i] + "		" + name[i] + "		" + price[i] + "	" + qty[i] + "	" + g);
	}
	}
}

class Report extends Stock
{	
	void hello()
	{
		System.out.println("\nDerived Class");
	}

	
	void display1()
	{	
		System.out.println("\nP_Id	"  +  "Name		"  + "Quantity	" + "Price" );	
		System.out.println(product_id[0]+ "	" + name[0] + "	" + qty[0] + "	" + price[0]);

		super.hello();
		System.out.println("\n");		
	}
}

class Enterprise7
{
	public static void main(String args[])
	{		
		Report rep = new Report();
		rep.add_stock();
		rep.display1();
		rep.display();	
		rep.hello();
		
	}
}
import java.util.*;
import java.util.Scanner;

class Stock
{
	Scanner sc = new Scanner(System.in);
		
	int product_id[];
	String name[];
	int qty[];
	int price[];
	int i=0,num=0;

	public void read()
	{

	System.out.println("Enter 1 for adding stock");
	System.out.println("Enter 0 to exit");
		
	int choice=sc.nextInt();
			
	switch(choice)
	{
	case 0:
		System.exit(0);

	case 1:
		System.out.println("You have entered one");
		System.out.println("Enter the number of products you wants to enter: ");
		num=sc.nextInt();
		
		product_id = new int[num];
		name= new String[num];
		price = new int[num];
		qty = new int[num];

		for(i = 0; i < num; i++)
		{
			System.out.println("");
			System.out.printf("Enter product %d Details  ",i+1);
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
	

	}


	public void display()
	{
	System.out.println("Product_Id " + " Name  " + " Quantity " + " Price ");
	for(i = 0;i < num;i++)
	{
		System.out.println("----------------------------------------");

		System.out.println(product_id[i] + "       " + name[i] + "       " + price[i] + "       " + qty[i]);
	}
	}

}

 class Enterprise1_2
{
	public static void main(String args[])
	{
		System.out.println("Hello World");
		
		Stock st = new Stock();

		st.read();
		st.display();			
	}
}
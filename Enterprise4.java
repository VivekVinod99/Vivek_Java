import java.util.*;
class Enterprise4
{	
	Scanner sc = new Scanner(System.in);

	int product_id[];
	String name[];
	int qty[];
	int price[];
	int gst[];
	int i=0,num=0;
	
	void read()
	{
	System.out.println("Enter 1 for adding stock");
	System.out.println("Enter 0 to exit");
		
	int choice=sc.nextInt();
			
	switch(choice)
	{
	case 0:
		System.exit(0);
		break;

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
		break;

	default:
		System.out.println("Wrong Choice!\n");
		read();		
	 }
	}	
	
	void display()
	{
	System.out.println("Product_Id " + " Name  " + " Quantity " + " Price " + "		"+"Added_by ");
	for(i = 0;i < num;i++)
	{
		System.out.println("----------------------------------------");
		System.out.println(product_id[i] + "       " + name[i] + "       " + qty[i] + "       " + price[i] + "		" + company_name);
	}
	}

	static String company_name="GGWPC";		// Static	

	static void change()		//Static Function
	{
		company_name = "XYZ Enterprises";
	}


	static				//Static Block
	{
		System.out.println("Welcome to the Enterprise Management System");
	}


	static class Inner
	{
		void msg(){
		System.out.println("Inner Class");}
	}

	public static void main(String args[])
	{
		Enterprise4 sh = new Enterprise4();
		Enterprise4.change();
		sh.read();
		sh.display();

		Enterprise4.Inner obj = new Enterprise4.Inner();
		obj.msg();				
	}
}
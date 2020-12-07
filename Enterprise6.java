//Q6
import java.util.*;

class Enterprise6
{
	Scanner sc = new Scanner(System.in);
		
	int id,qt,pr,g;
	String na;

	Enterprise6(){}	// Default Constructor

	Enterprise6(int id, String na, int qt, int pr)
	{
		this.id = id;			//this Keyword
		this.na = na;
		this.qt = qt;
		this.pr = pr;
	}	


	Enterprise6(int P_id, String Name, int Qty, int Price, int GST)	//Constructor Overloading
	{
		id = P_id;
		na = Name;
		qt = Qty;
		pr = Price;
		g = GST;
	}	

	static void fun1(int id, String n, int q, int p)
	{	
		System.out.println("");
		System.out.println("Product_Id	" + "Name	" + "Quantity	" +  "Price");
		System.out.print( id + "		" + n + "	" + q + "		" + p + "\n");
	}

	static void fun1(int id, String n, int q, int p, int g)		//Function Overloading
	{	
		System.out.println( id + "		" + n + "	" + q + "		" + p + "	" + g);
		System.out.println("Function Overloading");
	}


	
	void display1()
	{
		System.out.println("");
		System.out.println("P_Id " + id +  "	Quantity " + qt + "	Name " + na + "	Price" + pr);	
	}
	
	void display2()
	{
		System.out.println("P_Id " + id +  "	Quantity" + qt + "	Name " + na + "	Price " + pr + "	GST " + g);	
		System.out.println("Constructor Overloading");
	}



	int product_id[];		//Initializing Variables
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
	System.out.println("Product_Id " + " Name  " + " Quantity " + " Price  " + "	" + " Added_by ");
	for(i = 0;i < num;i++)
	{
		System.out.println("--------------------------------------------------------");

		System.out.println(product_id[i] + "       " + name[i] + "       " + qty[i] + "       " + price[i] + "	" + company_name);
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


	public static void main(String args[])
	{
		
		Enterprise6 sh1 = new Enterprise6(1001, args[0], 50, 250);
		sh1.display1();

		Enterprise6 sh2 = new Enterprise6(1002,"Keyboard", 70, 850, 18);	//Constructor Overloading
		sh2.display2();

		Enterprise6 sh3 = new Enterprise6();
		sh3.fun1(1001, "Mouse", 50, 250);
		sh3.fun1(1002, "Keyboard", 100, 850, 18);		//Function Overloading

		Enterprise6 sh = new Enterprise6();		//Calling Default Constructor
		sh.change();
		sh.read();
		sh.display();

		
	}
}
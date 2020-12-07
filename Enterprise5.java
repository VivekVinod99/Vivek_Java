//Q5
import java.util.*;
class Enterprise5
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
		Exit();
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
	System.out.println("Product_Id " + " Name  " + " Quantity " + " Price");
	for(i = 0;i < num;i++)
	{
		System.out.println("----------------------------------------");
		System.out.println(product_id[i] + "       " + name[i] + "       " + qty[i] + "       " + price[i]);
	}
	}


	static				//Static Block
	{
		System.out.println("Welcome to the Enterprise Management System");
	}


	public void Exit()
	{
   	 Scanner Exit_data=new Scanner(System.in);
    	 System.out.println("Do you Want to Exit -- Y/N");
                    String ans_response=Exit_data.next();
                    String yes="Y";
                    String no="N";

                   if(ans_response.equals(yes))
                   {
                   	System.out.println("You are Exit");
                   }
                   else if(ans_response.equals(no))
                   {
                   	read();
                   }
                   else
                   {
                   	System.out.println("Wrong Choice");
                        Exit();
                   }
}   

	public static void main(String args[])
	{
		StringBuffer sb = new StringBuffer("XYZ Enterprise");
		sb.replace(0,3,"My");
		System.out.println(sb);
		
		Enterprise5 sh = new Enterprise5();
		sh.read();
		sh.display();

				
	}
}
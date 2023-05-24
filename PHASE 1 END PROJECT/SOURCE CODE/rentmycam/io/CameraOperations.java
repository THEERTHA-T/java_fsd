//implements different operations of camera 

package rentmycam.io;

//import packages
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//structure
class Camera
{
	String model;
	String brand;
	String status;
	double price;
}

//custom exception class
//extending main exception class

class InSufficientBalanceException extends Exception
{
	//constructor
	public InSufficientBalanceException(String str)
	{
		super(str);
	}
}

public class CameraOperations
{
	//set camera id to 1 initially
	//camera id starts from 1
	static int camera_id=1;
	
	//set status of camera to available
	static String status="AVAILABLE";
	
	//create arraylist to store camera details
	ArrayList<Camera> al=new ArrayList<>();
	
	//pass arraylist object to hashmap
	HashMap<Integer,Camera> hm=new HashMap<>();
	
	//create scanner object
	Scanner sc=new Scanner(System.in);
	
	//declare list
	Camera c;	
	
	public void addCamera()
	{
		//read camera details from user
		System.out.print("\nENTER THE CAMERA BRAND : ");
		String brand=sc.next();
		
		System.out.print("\nENTER THE CAMERA MODEL : ");
		String model=sc.next();
		
		System.out.print("\nENTER THE PER DAY PRICE (INR) : ");
		double price=sc.nextDouble();
	    
		//pass read values to add method
		add(brand,model,price,status);
	}
	
	public void add(String brand,String model,double price,String status)
	{
		//create object for camera
		c=new Camera(); 
		
		//assign all fields
		c.model=model;
		c.brand=brand;
		c.price=price;
		c.status=status;
		
		//insert entries to list
		hm.put(camera_id, c);
		
		System.out.println("\nYOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST ");
		System.out.println("\n****YOUR CAMERA ID IS "+camera_id+"****");
		
		//auto increment camera id for each new camera
		camera_id++;		
	}		
	
	//method to display all the cameras
	public void disp()
	{
		//check if list is empty
		if(!(hm.isEmpty()))
		{
			System.out.println("\n- - - CAMERA DATA - - -");
			System.out.println("\n==========================================================");
			System.out.format("%-15s %-10s %-10s %-10s %-10s\n","CAMERA ID","BRAND","MODEL","PRICE"," STATUS");
			System.out.println("==========================================================\n");

			//iterating through the list
			for(Map.Entry<Integer,Camera>item:hm.entrySet())
			{
				System.out.format("%-15s %-10s %-10s %-10s %-10s\n\n",item.getKey(),item.getValue().brand,item.getValue().model,item.getValue().price,item.getValue().status);
			}
		}
		else //if list is empty
		{
			System.out.println("\n -------------------------------");
			System.out.println("|  THE CAMERA LIST IS  EMPTY   |");
			System.out.println(" -------------------------------");

		}
	}
	
	
	//remove camera from the list
	public void removeCamera()
	{
		//display camera list
		disp();
		
		if(!(hm.isEmpty()))
		{
			//read camera id to remove from the list
			System.out.print("\n\nENTER CAMERA ID TO REMOVE : ");
			int rem_id=sc.nextInt();

			int flag=0;
		
			if(hm.containsKey(rem_id))
			{
				hm.remove(rem_id);
				flag=1;
			}
			
			if(flag==1)
			{
				System.out.println("\nCAMERA ID "+rem_id+" SUCCESSFULLY REMOVED FROM THE LIST");
			}
			else
			{			
				System.out.println("\nCAMERA ID "+rem_id+" NOT FOUND IN THE LIST");
			}
		
			//display updated list
			disp();
		}
	}
} //end of base class


//sub class extending main class
//inheritance
class CameraOperations2 extends CameraOperations
{
	//rent a camera
	public void rent()
	{
		//create object for wallet class
		MyWallet myWal=new MyWallet();
		
		//display available camera to rent
		dispAvailable();
		
		//check if list is empty
		if(!(hm.isEmpty()))			
		{
			//read camera id to rent
			System.out.print("\nENTER CAMERA ID TO RENT :");
			int rent_id=sc.nextInt();
			
			//check rent id contains in list
			if(hm.containsKey(rent_id))
			{
				//get price of given rent id
				double cur_price=hm.get(rent_id).price;
				
				//get user wallet balance
				double my_bal=myWal.bal;
				
				//exception handling
				try 
				{
					//if user balance is not greater than camera's price
					if(my_bal<cur_price)
					{
						//throw custom exception
						throw new InSufficientBalanceException("\nERROR : TRANSACTION FAILED DUE TO INSUFFICIENT WALLET BALANCE . PLEASE DEPOSIT THE AMOUNT TO YOUR WALLET");
					}
				}
				
				catch(InSufficientBalanceException e)
				{
					System.out.println(e.getMessage()); //print exception object message
				}
				
				//if have sufficient balance
				if(my_bal>cur_price)
				{
					//update user balance
					myWal.bal=my_bal-cur_price;
					
					System.out.println("\nTRANSACTION SUCCESSFULLY COMPLETED\n");
					System.out.println("CAMERA         - "+hm.get(rent_id).brand+" "+hm.get(rent_id).model);
					System.out.println("TOTAL PRICE    - INR : "+hm.get(rent_id).price);
					System.out.println("WALLET BALANCE - "+(my_bal-cur_price));
					hm.get(rent_id).status="RENTED";
				}
			}
			else
			{
				System.out.println("/nCAMERA ID NOT FOUND");
			}
			disp();			
		}
	}
	
	//display available cameras only
	public void dispAvailable()
	{
		if(!(hm.isEmpty()))
		{
			System.out.println("\n- - - VIEW AVAILABLE CAMERA - - -");
			System.out.println("\n==========================================================");
			System.out.format("%-15s %-10s %-10s %-10s %-10s\n","CAMERA ID","BRAND","MODEL","PRICE"," STATUS");
			System.out.println("==========================================================\n");
		
			for(Map.Entry<Integer,Camera>item:hm.entrySet())
			{
				//display camera which are available
				if(item.getValue().status=="AVAILABLE")
				{
					System.out.format("%-15s %-10s %-10s %-10s %-10s\n\n",item.getKey(),item.getValue().brand,item.getValue().model,item.getValue().price,item.getValue().status);
				}
			}
		}
		else
		{
			System.out.println(" \n-------------------------------");
			System.out.println("|     NO CAMERA AVAILABLE     |");
			System.out.println(" -------------------------------");

		}
	}	
}

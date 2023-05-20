//implements main menu and sub menu

package rentmycam.io;

//import scanner class
import java.util.Scanner;

public class MyCamera
{
	int ch;
	
	//create Scanner object
	Scanner sc=new Scanner(System.in); 
		
	//create object for inherited class of CameraOperations
	CameraOperations2 camOp=new CameraOperations2();
	
	//create object for MyWallet class
	MyWallet myWal=new MyWallet();
	
	//main menu 
	public void menu()
	{
		int ch;	
		do
		{
			System.out.println("\n--- MENU --- \n \n1. MY CAMERA \n2. RENT A CAMERA \n3. VIEW ALL CAMERA \n4. MY WALLET \n5. EXIT");
				
			//read choice number from user
			System.out.print("\nEnter your choice :");
			ch=sc.nextInt();
				
			switch(ch)
			{
			case 1 :mycamera();
					 break;
					
			case 2 :camOp.rent();
					 break;
						 
		    case 3 :camOp.disp();
					 break;
						 
			case 4 : myWal.wallet();
					 break;
			
			case 5 : break;		
			}
			}while(ch!=5); //continue loop until choice made is 5
		}
		
		//sub menu of my camera option
		public void mycamera()
		{
			do
			{
				
				System.out.println("\n--- MY CAMERA MENU---\n\n1. ADD CAMERA \n2. REMOVE CAMERA \n3. VIEW MY CAMERA \n4. GO TO PREVIOUS MENU");

				//reading option from user
				System.out.print("\nEnter Your Choice : ");
				ch=sc.nextInt();
			
				switch(ch)
				{
				case 1 : camOp.addCamera(); //add new camera
						camOp.disp();
						break;
					 
				case 2 : camOp.removeCamera(); //remove camera
						break;
					 
				case 3 : camOp.disp(); //display available camera
						break;
					 
				case 4 : menu(); //go back to previous menu
						break;
				}
			}while(ch!=4); //iterate until option is 4
		}
}

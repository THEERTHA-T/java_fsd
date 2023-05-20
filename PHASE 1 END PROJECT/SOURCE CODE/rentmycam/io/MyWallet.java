//implement user wallet operations
package rentmycam.io;

//import scanner class
import java.util.Scanner;

public class MyWallet 
{
	//initially set balance to 0
	public static double bal=0;
	
	//create scanner object
	Scanner sc=new Scanner(System.in);
	
	public double wallet()
	{
		double amt;
		
		System.out.println("\nYOUR CURRENT WALLET BALANCE : INR "+bal);
		System.out.print("\nDO YOU WANT TO DEPOSIT MORE AMOUNT TO YOUR WALLET ? ");
		System.out.println("1. YES 2. NO");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:System.out.print("ENTER THE AMOUNT (INR) :"); 
			   amt=sc.nextDouble(); //read amount to add
			   bal=bal+amt; //add amount to current balance
			   System.out.println("\nYOUR WALLET BALANCE UPDATED SUCCESSFULLY..!!");
			   System.out.print("\nCURRENT WALLET BALANCE "+bal+"\n");
		       break;
		case 2:break;
		default:System.out.println("\nINVALID OPTION");
				break;
		}
		return bal;
	}
}

package assistedPracticeProject2;
import java.util.Scanner; //importing scanner class
public class Practice_Project5_1 
{
	public static void main(String args[])
	{
		int num1,num2; //declare variables
		Scanner sc=new Scanner(System.in); //create scanner object
		System.out.println("Enter the First Number :");
		num1=sc.nextInt(); //read first number
		System.out.println("Enter the second Number :");
		num2=sc.nextInt(); //read second number
		try
		{
			if(num2==0) //check if second number is 0
			{
                throw(new ArithmeticException("Denominator cannot be zero")); //throw exception
            }
			else
			{
				System.out.println("RESULT = "+(num1/num2)); //else calculate result
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception : "+ae); //print exception error if second number is 0
		}
	}

}

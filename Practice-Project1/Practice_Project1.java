//program to implement implicit and explicit type casting

package assistedPracticeProject;

public class Practice_Project1 
{
	public static void main(String args[])
	{
		System.out.println("----TYPE CASTING----\n");
		System.out.println("1.IMPLICIT TYPE CASTING\n");
		
		//assigning character variable
		char n1='N';
		System.out.println("CHARACTER = "+n1);
		
		//assigning character value to integer variable
		int n2=n1;
		System.out.println("INTEGER = "+n2);
		
		//assigning character value to float variable
		float n3=n1;
		System.out.println("FLOAT = "+n3);
		
		//assigning character value to double variable
		double n4=n1;
		System.out.println("DOUBLE = "+n4);
				
		//assigning character value to long variable
		long n5=n1;
		System.out.println("LONG = "+n5);
		
		System.out.println("\n2.EXPLICIT TYPE CASTING\n");
		//explicit conversion
		
		float f1=10.22f; //assigning float value
		int f2=(int)f1; // converting float to int explicitly
		double f3=(double)f1; //converting float to double
		System.out.println("FLOAT = "+f1);
		System.out.println("INTEGER ="+f2);
		System.out.println("DOUBLE ="+f3);
		
	}
}

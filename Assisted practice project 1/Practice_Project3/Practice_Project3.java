//implementation of methods 

package assistedPracticeProject;
import java.util.Scanner;

public class Practice_Project3
{
	void area(int l,int b) // area function with two arguments
	{
		System.out.println("Area of Rectangle ="+(l*b)); //calculate area of rectangle
	}
	void area(int s) //area function with single argument
	{
		System.out.println("Area of Square ="+(s*s)); //calculate area of square
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Practice_Project3 p1=new Practice_Project3(); //creating object for main class
		int length,breadth;
		System.out.println("Enter Length of Rectangle :");
		length=sc.nextInt();
		System.out.println("\nEnter Breadth of Rectangle :");
		breadth=sc.nextInt();
		p1.area(length,breadth); //calling function using object and passing arguments
		
		System.out.println("\nEnter side of square:");
		int side=sc.nextInt();
		p1.area(side);

	}
}

//Implementation of constructor type


package assistedPracticeProject;

public class Practice_Project4 
{
	Practice_Project4()   //default constructor
	{
		System.out.println("---DEFAULT CONSTRUCTOR---\n");
		String name="default";   //assigning default value to 'name'
		System.out.println("NAME = "+name);
	}
	Practice_Project4(String name,int age) //constructor with arguments
	{
		String n=name;  	// assigning called value to constructor variable
		int a=age;
		System.out.println("\n---PARAMETERIZED CONSTRUCTOR---\n");
		System.out.println("NAME = "+n);
		System.out.println("AGE = "+a);
		
	}
	public static void main(String args[])
	{
		Practice_Project4 p1=new Practice_Project4(); //creating default constructor
		Practice_Project4 p2=new Practice_Project4("parameterized",33); //creating parameterized constructor
	}
}

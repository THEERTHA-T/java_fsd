package assistedPracticeProject;
import java.util.Scanner;
class default_project
{
	void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("AGE = "+age);
		
	}
}


public class Practice_Project2_default 
{
	public static void main(String args[])
	{
		System.out.println("DEFAULT ACCESS MODIFIER\n");
		default_project d1=new default_project();
		d1.read();
		
	}
}


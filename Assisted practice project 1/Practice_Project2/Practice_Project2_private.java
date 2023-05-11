package assistedPracticeProject;
import java.util.Scanner;
class private_project
{
	private void read()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=sc.nextInt();
		System.out.println("AGE = "+age);
		
	}
}


public class Practice_Project2_private
{
	public static void main(String args[])
	{
		System.out.println("PRIVATE ACCESS MODIFIER\n");
		private_project d1=new private_project();
		//d1.read(); //error when calling private method of another class
		System.out.println("ERROR-- method not visible");
	}
}


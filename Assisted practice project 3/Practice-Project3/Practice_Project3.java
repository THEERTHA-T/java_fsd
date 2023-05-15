//find sum of n number of elements
package assistedPracticeProject3;
import java.util.Scanner; //importing scanner class

public class Practice_Project3 
{
	public void sum(int L,int R,int n,int[] arr) //method definition
	{
		int sum=0; //set sum=0
		if((L>=0)&&(L<=R)&&(R<=(n-1))) //check the condition
		{
			for(int i=L-1;i<=R-1;i++) //start from range 1 to range 2
			{
				sum=sum+arr[i]; //find sum
			}
			System.out.println("\nSUM OF ELEMENTS FROM RANGE " +L+" TO "+R+" IS "+sum); //print sum
		}
		else
		{
			System.out.println("RANGE IS INCORRECT...!!"); //if condition is wrong
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); //creating scanner object	
		System.out.println("Enter the value for n :");
		int n=sc.nextInt(); //reading size of array
		
		System.out.println("ENTER ELEMENTS OF ARRAY :");
		int[] arr=new int[n]; //creating array
		for(int i=0;i<n;i++) //iterating until n
		{
			arr[i]=sc.nextInt(); //reading each number into array
		}
		
		System.out.println("\nEnter first position :");
		int L=sc.nextInt(); //read first range
		
		System.out.println("\nEnter last position :");
		int R=sc.nextInt(); //read last range
		
		Practice_Project3 p1=new Practice_Project3(); //create object
		
		p1.sum(L,R,n,arr); //call method by passing arguments
				
	}

}

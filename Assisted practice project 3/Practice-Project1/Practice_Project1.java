//program to right rotate an array by 5 steps

package assistedPracticeProject3;
import java.util.Scanner; //importing scanner class
public class Practice_Project1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); //creating scanner object
		
		System.out.println("Enter size of array :");
		int n=sc.nextInt(); //reading size of array
		System.out.println("ENTER ELEMENTS ODF ARRAY :");
		int[] arr=new int[n]; //creating array
		for(int i=0;i<n;i++) //iterating until n
		{
			arr[i]=sc.nextInt(); //reading each number into array
		}
		
		System.out.println("----ARRAY-----");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" "); //displaying array elements
		}
		
		System.out.println("\n\nAFTER ROTATION BY 5 STEPS");
		for(int i=0;i<5;i++) //iterate 5 times
		{
			int last=arr[n-1]; //setting last element
			for(int j=n-1;j>0;j--) //replace from last to first
			{
				arr[j]=arr[j-1]; //replacing adjacent elements
			}
			arr[0]=last; //setting last element to first
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" "); //displaying array elements after rotation
		}
	}

}

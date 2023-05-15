//finding fourth smallest element from unsorted array
package assistedPracticeProject3;
import java.util.Scanner; //importing scanner class
import java.util.Arrays;
public class Practice_Project2 
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
		
		Arrays.sort(arr); //sorting array in ascending order
		
		//remove duplicate element from array
		int[] ARR=new int[n]; //creating array
		int k=0; //initialize k to 0
		
		for(int i=0;i<n-1;i++) //iterate through elements
		{ 
			if(arr[i]!=arr[i+1]) //check adjacent elements
			{
				ARR[k]=arr[i]; //add to new array
				k++; //update k
			}
			else
			{
				continue; //continue if two elements are same
			}
		}
		ARR[k]=arr[n-1]; //set last element to new array
		
		System.out.println("\n");
		System.out.print("FOURTH SMALLEST ELEMENT : "+ARR[3]); //displaying fourth largest element		
	}

}

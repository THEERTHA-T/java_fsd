//implementation of arrays
package assistedPracticeProject;
import java.util.*;
public class Practice_Project9 
{
	public static void main(String args[])
	{
		//creating integer array
		int even[]; //reference is created
		even=new int[5]; //allocating memory
		
		//adding elements
		even[0]=2;
		even[1]=4;
		even[2]=6;
		even[3]=8;
		even[4]=10;
		
		//displaying 2 nd element
		System.out.println("\nSECOND ELEMENT ="+even[1]);
		
		//array length
		int len=even.length;
		System.out.println("\nLENGTH OF ARRAY ="+len);
		
		//displaying array
		System.out.println("\nARRAY ELEMENTS ARE =");
		for(int i=0;i<len;i++)
		{
			System.out.print(even[i]+" ");			
		}
		
		//creating two dimensional array
		int matrix[][]=new int[2][3];
		//input from users
		System.out.println("\n\nTWO DIMENSIONAL ARRAY");
		System.out.println("\nEnter elemnts of 2D array :");
		Scanner sc=new Scanner(System.in);//creating scanner object
		//loop for matrix row
		for(int i=0;i<2;i++)
		{
			//loop for matrix column
			for(int j=0;j<3;j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		
		
		//displaying 2D array
		System.out.println("\n--2D MATRIX-- ");
		for (int i = 0; i < 2; i++)   
		{   
		for (int j = 0; j < 3; j++)   
		//prints the array elements  
		System.out.print(matrix[i][j] + " ");   
		System.out.println();   
		}   
		
	}
}

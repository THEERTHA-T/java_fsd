//multiply two matrices
package assistedPracticeProject3;

public class Practice_Project4 
{
	public static void main(String[] args) 
	{
		int matrix1[][]= {{1,2,3},{2,1,1},{5,1,2}}; //matrix 1
		int matrix2[][]={{2,2,1},{2,1,2},{3,2,1}}; //matrix 2
		
		int result[][]=new int[3][3]; //matrix to store the result
		
		System.out.println("---MATRIX 1---"); //displaying matrix 1
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n---MATRIX 2---"); //displaying matrix 2
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(matrix2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n---RESULTANT MATRIX---"); //displaying matrix result
		for(int i=0;i<3;i++) //iterate through row
		{
			for(int j=0;j<3;j++) //iterate through column
			{
				result[i][j]=0; //set to 0
				for(int k=0;k<3;k++)
				{
					result[i][j]=matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(result[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

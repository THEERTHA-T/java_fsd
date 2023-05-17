//implement linear search
package assistedPracticeProject4;

public class Practice_Project1
{
	public void linear_search(int[] arr,int key) //method definition
	{
		int len=arr.length; //find array size
		int f=0; //set flag=0
		for(int i=0;i<len;i++) //iterate through array
		{
			if(arr[i]==key) //compare item of array with key
			{
				System.out.println("ITEM "+key+" FOUND AT POSITION "+(i+1));
				f=1; //set flag=0
			}	
		}
		if(f==0)
		{
			System.out.println("ITEM "+key+" NOT FOUND");
		}
	}
	public static void main(String[] args) 
	{
		Practice_Project1 p1=new Practice_Project1(); //object creation
		int arr[]= {30,20,40,44,52,11};
		int key=44;
		p1.linear_search(arr,key); //call method
	}

}

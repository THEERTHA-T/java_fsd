package assistedPracticeProject4;

public class Practice_Project8 
{
	int partition (int arr[], int start, int end)  
	{  
	    int pivot = arr[end]; // pivot element  
	    int i = (start - 1);  
	 
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        if (arr[j] < pivot)   //current element <pivot
	        {  
	            i++; 
	            int temp = arr[i];  //swapping
	            arr[i] = arr[j];  
	            arr[j] = temp;  
	        }  
	    }  
	    int temp1 = arr[i+1];  
	    arr[i+1] = arr[end];  
	    arr[end] = temp1;  
	    return (i + 1);  
	}  
	  
	void quick(int[] arr, int start, int end)   
	{  
	    if (start < end)  
	    {  
	        int partition_index = partition(arr, start, end); 
	        quick(arr, start, partition_index - 1);  
	        quick(arr, partition_index + 1, end);  
	    }  
	} 
	void disp(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		Practice_Project8 p7=new Practice_Project8();
		int[] arr= {6,55,2,10,8,32,11};
		int size=arr.length;
		System.out.println("\nQUICK SORT");
		System.out.println("\nBEFORE SORTING");
		p7.disp(arr);
		p7.quick(arr,0,size-1);
		System.out.println("\n\nAFTER SORTING");
		p7.disp(arr);
	}

}

package assistedPracticeProject4;

public class Practice_Project7 
{
	public void sort(int[] arr,int start,int last)
	{
		 if (start < last) 
		 {
	            int mid=(start+last) / 2;
	            sort(arr, start, mid);
	            sort(arr, mid + 1, last);
	            merge_sort(arr, start, mid, last);
	        }
	}
	public void merge_sort(int[] arr,int start,int mid,int last)
	{
		 int end1 = mid - start + 1;
	     int end2 = last - mid;	    
	     
	     //temp arrays
	     int T1[] = new int[end1];
	     int T2[] = new int[end2];
	     
	     //add both arrays
	     for (int i = 0; i < end1; ++i)
	            T1[i] = arr[start + i];
	     for (int j = 0; j < end2; ++j)
	            T2[j] = arr[mid + 1 + j];
	 
	     int i = 0, j = 0;
	     int k = start;
	     while (i < end1 && j < end2) 
	     {
	    	 if (T1[i] <= T2[j]) 
	    	 {
	                arr[k] = T1[i];
	                i++;
	         }
	        else 
	        {
	        	arr[k] = T2[j];
	            j++;
	        }
	            k++;
	     }
	 
	        while (i < end1) //left array
	        {
	            arr[k] = T1[i];
	            i++;
	            k++;
	        }
	 
	        while (j < end2) //right array
	        {
	            arr[k] = T2[j];
	            j++;
	            k++;
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
		Practice_Project7 p7=new Practice_Project7();
		int[] arr= {4,3,2,6,8,7,1};
		int size=arr.length;
		System.out.println("\nMERGE SORT");
		System.out.println("\nBEFORE SORTING");
		p7.disp(arr);
		p7.sort(arr,0,size-1);
		System.out.println("\n\nAFTER SORTING");
		p7.disp(arr);
	}

}

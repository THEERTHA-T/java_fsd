package assistedPracticeProject4;

public class Practice_Project3 
{
	public int binarySearch(int[] arr, int left, int right, int key)
    {
        if (left > right)
        {
            return -1;
        }
        int mid = (left + right) / 2; //find mid value
        if (key == arr[mid])//if key is found
        {
            return mid;
        }
        else if (key < arr[mid])
        {
            return binarySearch(arr, left, mid - 1, key);
        }
        else 
        {
            return binarySearch(arr, mid + 1, right, key);
        }
    }
	public  int exponentialSearch(int[] arr, int key)
    {
        int range = 1;
 
        while (range < arr.length && arr[range] < key) //find range
        {
        	range *= 2;        
        }
         return binarySearch(arr, range/2, Integer.min(range, arr.length - 1), key);
    }

	public static void main(String[] args) 
	{
		 Practice_Project3 p3=new Practice_Project3();
		 int[] arr = {12, 35, 67, 88, 90, 104};
	     int key = 12;
	     int res = p3.exponentialSearch(arr, key);
	 	for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nItem to search :"+key);
	     if (res != -1)
	     {
	            System.out.println("ITEM "+key+" FOUND AT POSITION " + (res+1));
	     }
	     else 
	     {
	            System.out.println("ITEM "+key+" NOT FOUND");
	     }
	}

}

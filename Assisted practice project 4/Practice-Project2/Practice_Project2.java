//binary search
package assistedPracticeProject4;

public class Practice_Project2 
{
	public int binary_search(int[] arr,int start,int last,int key) //method definition
	{
		if(start<last) //check if starting is < than last
		{
			int mid=(start+last)/2; //find middle element
			if(key==arr[mid]) //check if key = middle element
			{
				return mid+1;
			}
			else if(key<arr[mid]) //check if < middle element
			{
				 return binary_search(arr,start,mid-1,key); //recursive call
			}
			else if(key>arr[mid])  //check if > middle element
			{
				 return binary_search(arr,mid+1,last,key);
			}

		}
			return -1; //if item not found
	}
	public static void main(String[] args) 
	{
		Practice_Project2 p2=new Practice_Project2();
		int[] arr= {11,22,33,37,40,51,69,100};
		int key=69; //key to search
		int len=arr.length; //find length
		int res=p2.binary_search(arr,0,len-1,key);
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nItem to search :"+key);

		if(res==-1)
		{
			System.out.println("\nITEM "+key+" NOT FOUND");			
		}
		else
		{
			System.out.println("\nITEM "+key+" FOUND AT POSITION "+res);
		}
	}

}

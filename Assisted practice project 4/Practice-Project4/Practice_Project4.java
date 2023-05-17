package assistedPracticeProject4;

public class Practice_Project4
{
	public void selection_sort(int[] arr,int size)
	{
		for(int i=0;i<size;i++) //iterate through list
		{
			int min_pos=i; //set position of minimum element as i initially
			for(int j=i+1;j<size;j++) //inner for loop
			{
				if(arr[min_pos]>arr[j])
				{					
					min_pos=j; //set minimum element position
				}
			}
			
			int temp=arr[min_pos];
			arr[min_pos]=arr[i];
			arr[i]=temp;
				
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
		Practice_Project4 p4=new Practice_Project4();
		int[] arr= {66,8,57,4,33,21};
		int size=arr.length;
		System.out.println("\nBEFORE SORTING");
		p4.disp(arr);
		p4.selection_sort(arr,size);
		System.out.println("\n\nAFTER SORTING");
		p4.disp(arr);
		
	}

}

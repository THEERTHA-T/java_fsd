package assistedPracticeProject4;

public class Practice_Project5 
{
	public void bubble_sort(int[] arr,int size)
	{
		 for (int i = 0; i < size-1; i++)
		 {
	            for (int j = 0; j <size - i-1; j++)
	            {
	                if (arr[j] > arr[j + 1])
	                {
	                	int temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            } 
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
		Practice_Project5 p5=new Practice_Project5();
		int[] arr= {20,30,10,60,40};
		int size=arr.length;
		System.out.println("\nBEFORE SORTING");
		p5.disp(arr);
		p5.bubble_sort(arr,size);
		System.out.println("\n\nAFTER SORTING");
		p5.disp(arr);
	}

}

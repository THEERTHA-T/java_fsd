package assistedPracticeProject4;

public class Practice_Project6 
{
	public void insertion_sort(int[] arr,int n)
	{
		for (int i = 0; i < n; i++)
		{
            int key = arr[i];
            int j = i - 1;
             while (j >= 0 && arr[j] > key) 
             {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
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
		Practice_Project6 p6=new Practice_Project6();
		int[] arr= {2,80,11,4,7};
		int size=arr.length;
		System.out.println("\nINSERTION SORT");
		System.out.println("\nBEFORE SORTING");
		p6.disp(arr);
		p6.insertion_sort(arr,size);
		System.out.println("\n\nAFTER SORTING");
		p6.disp(arr);
	}

}

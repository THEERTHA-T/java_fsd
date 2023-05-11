//demonstrating try and catch
package assistedPracticeProject2;

public class Practice_Project4 
{
	public static void main(String[] args) 
	{
		int number=50; //assigning a value to number variable
		try //try block
		{
			int sol=number/0; //statement that may cause error
		}
		catch(Exception e) //catch exception to catch the error
		{
			System.out.println("Error : "+e); //printing the exception error
		}
		
	}

}

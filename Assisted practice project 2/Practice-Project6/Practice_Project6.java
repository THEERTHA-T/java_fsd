// demonstrate exception handling
package assistedPracticeProject2;

public class Practice_Project6 
{
	public static void main(String[] args) 
	{
		  try
		  {  
		      //code that may raise exception  
		      int num=100/0;  
		   }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Exception = "+e);
		  }  
		  finally
		  {
		   System.out.println("EXCEPTION HANDLING");  
		  }  
	}
}

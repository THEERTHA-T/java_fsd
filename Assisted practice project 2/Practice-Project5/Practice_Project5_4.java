package assistedPracticeProject2;

class CustomException extends Exception  //extending exception
{
	   String message;
	   CustomException(String str)  //constructor
	   {
	      message = str; //initialize
	   }
	   public String toString() 
	   {
	      return ("Custom Exception Occurred : " + message); //return custom message
	   }
	}
	public class Practice_Project5_4 
	{
	   public static void main(String args[]) 
	   {
	      try 
	      {
	         throw new CustomException("CUSTOM EXCEPTION"); //throw custom exception
	      } 
	      catch(CustomException e) 
	      {
	         System.out.println(e);
	      }
	   }
	}

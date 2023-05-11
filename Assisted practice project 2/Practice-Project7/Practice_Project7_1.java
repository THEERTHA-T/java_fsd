package assistedPracticeProject2;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class Practice_Project7_1 
{
		  public static void main(String[] args) 
		  {
			  try 
			  {
				  FileWriter myWriter = new FileWriter("file1.txt");
				  myWriter.write("Hello Java Programming..!!");
				  myWriter.close();
				  System.out.println("SUCCESS");
			  }
			  catch (IOException e) 
			  {
				  System.out.println("ERROR");
				  e.printStackTrace();
			  }
		  }	  
}
	


package assistedPracticeProject2;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Practice_Project7 
{
  public static void main(String[] args) 
  {
    try 
    {
      File file2 = new File("file1.txt");
      if (file2.createNewFile()) 
      {
    	System.out.println("FILE CREATED--!!!");
        System.out.println("\nNAME OF THE FILE " + file2.getName());
      } 
      else 
      {
        System.out.println("Sorry ! File already exists.");
      }
    } 
    catch (IOException e) 
    {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
}

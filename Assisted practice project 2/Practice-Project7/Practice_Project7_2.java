package assistedPracticeProject2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Practice_Project7_2 
{
  public static void main(String[] args) 
  {
    try 
    {
      File file1 = new File("file1.txt");
      Scanner myReader = new Scanner(file1); //read file
      while (myReader.hasNextLine()) //read line by line
      {
        String data = myReader.nextLine();
        System.out.println(data); //print data
      }
      myReader.close(); //close file
    }
    catch (FileNotFoundException e) {
      System.out.println("ERROR");
      e.printStackTrace();
    }
  }
}
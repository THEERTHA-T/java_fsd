package assistedPracticeProject2;

import java.io.File;  // Import the File class

public class Practice_Project7_4 {
  public static void main(String[] args) { 
    File myObj = new File("file1.txt"); 
    if (myObj.delete()) 
    { 
      System.out.println("DELETED FILE: " + myObj.getName());
    } 
    else 
    {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
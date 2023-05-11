//implementation of thread by extending thread class
package assistedPracticeProject2;
import java.lang.*; //importing packages
public class Practice_Project1 extends Thread  //extending thread class 
{
	public void run() 
	{
		System.out.println("\nIMPLEMENTAION OF THREAD BY EXTENDING THREAD CLASS "); 
	}
	public static void main(String[] args) 
	{
		Practice_Project1 thread1=new Practice_Project1(); //creating class object
		thread1.start(); //starting thread using object
	}
}

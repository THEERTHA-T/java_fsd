//implementation of thread by implementing runnable interface

package assistedPracticeProject2;
import java.lang.*; //importing packages
public class Practice_Project1_1 implements Runnable
{
	public void run() 
	{
		System.out.println("\nIMPLEMENTAION OF THREAD BY IMPLEMENTAING RUNNABLE INTERFACE "); 
	}
	public static void main(String[] args) 
	{
		Practice_Project1_1 thread2=new Practice_Project1_1();  //creating class object
		Thread th1=new Thread(thread2); //passing class object to thread constructor
		th1.start();
	}

}

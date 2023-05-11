//demonstrating wait() and show()
package assistedPracticeProject2;
import java.lang.*; //importing packages
public class Practice_Project2 
{
		 static Object waitthread = new Object();	//creating object waitthread
		public static void main(String args[]) throws InterruptedException 
		{
			String str=Thread.currentThread().getName(); //get name of the current thread
			System.out.println("THREAD NAME = "+str); //displaying thread name
			System.out.println(str +" SLEEPING FOR 4 SECEOND");
			Thread.sleep(4000); //sleeping for 4 sec
			System.out.println(str +" WOKEN UP AFTER 4 SECOND");
			
			synchronized(waitthread) //synchronized() to handle wait()
			{
				System.out.println("\nTHREAD WAITING FOR IO DEVICES");
				waitthread.wait(2000); //waiting for 2 sec
			}
			System.out.println("THREAD WOKEN UP AFTER WAITING 2 SECOND");
		}
}

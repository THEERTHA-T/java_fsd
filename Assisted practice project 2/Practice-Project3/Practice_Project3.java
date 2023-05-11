//demonstrating synchronization
package assistedPracticeProject2;

class Synchronizedmethod 
{
 synchronized void display(int n) //display() is synchronized
 {
   for(int i = 1; i <= 5; i++) //iterating 1 to 5
   {  
     System.out.println(n+i);   //printing n 5 times
     try
     {  
       Thread.sleep(200);  //sleep for 2 miliseconds
     }
    catch(InterruptedException e) 
    {
       System.out.println(e); //handle exception
    } 
   }
  }  
}
class Thread1 extends Thread //thread 1 extending thread
{
	 Synchronizedmethod t;
	 Thread1(Synchronizedmethod t) //constructor
	 {  
		 this.t = t;  
	 }  
	 public void run()
	 {  
		 t.display(10);  //passing value 10 to display()
	 }  
}


 class Thread2 extends Thread //thread 2
{
	 Synchronizedmethod t;  
	 Thread2(Synchronizedmethod t) //constructor
	 {  
		 this.t = t;  
	 }  
	 public void run()
	 {  
		 t.display(100);  //passing value 100 to display()
	 }  
}
 
 
public class Practice_Project3 
{
public static void main(String[] args) 
{
	Synchronizedmethod sm = new Synchronizedmethod(); //creating object for synchronized method
	Thread1 t1 = new Thread1(sm); //creating object for thread 1 and passing object of synchronized method
	Thread2 t2 = new Thread2(sm);
    t1.start(); //calling run()
    t2.start();
 }
}

//diamond problem solution
package assistedPracticeProject2;

interface class1   //interface number 1
{  
	public default void display()   //display() 1
	{  
		System.out.println("the display() method of class1 ");  
	}  
} 

interface class2   //interface number 2
{  
	public default void display()   //display() 2
	{  
		System.out.println("the display() method of class2");  
	}  
}  

public class Practice_Project9 implements class1, class2   //implementing both interface class1 and class2
{  
	public void display()   
	{  
		class1.super.display();   //calling display of interface 1
		class2.super.display();  //calling display of interface 2
	}  
	public static void main(String args[])   
	{  
		Practice_Project9 p1 = new Practice_Project9();  //creating object for main class
		p1.display();  //calling display()
	}  
}  

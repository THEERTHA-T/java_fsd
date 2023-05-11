//implementing abstraction 
package assistedPracticeProject2;

abstract class shape //abstract class 
{
	int length=20;
	public abstract void area(); //abstract method
	public void display() //normal function
	{
		System.out.println("METHOD INSIDE ABSTRACT CLASS");
	}
}

class rectangle extends shape //sub class extending abstract class
{
	int breadth=4;
	public void area() //method
	{
		System.out.println("AREA = "+(length*breadth));

	}
}
public class Practice_Project8_4 {

	public static void main(String[] args) 
	{
		rectangle r1=new rectangle(); //creating object for sub class
		r1.display();
		r1.area();		
	}

}

//implementing class, object
package assistedPracticeProject2;

public class Practice_Project8_1  //main class
{
	int length,breadth; //declaring variables
	Practice_Project8_1(int len,int bred) //parameterized constructor
	{
		this.length=len; 
		this.breadth=bred;
	}
	void area() //method
	{
		System.out.println("LENGTH = "+length);
		System.out.println("BREADTH = "+breadth);
		System.out.println("AREA = "+(length * breadth));
	}
	public static void main(String[] args) 
	{
		Practice_Project8_1 p1=new Practice_Project8_1(10,5); //class object
		p1.area(); //calling function area() using object
		//area();  //ERROR : method can only be accessed by object
	}
}

//implementing inheritance
package assistedPracticeProject2;

class area //super class
{
	protected int length=20; //length declaring as protected
}
public class Practice_Project8_3 extends area //subclass extending super class 'area'
{
	int breadth=10; 
	public static void main(String[] args) 
	{
		Practice_Project8_3 p1=new Practice_Project8_3();
		System.out.println("LENGTH ="+p1.length); //length is accessible to sub class
		System.out.println("BREADTH ="+p1.breadth);
		System.out.println("AREA OF RECTANGLE ="+(p1.length*p1.breadth));
		
	}

}

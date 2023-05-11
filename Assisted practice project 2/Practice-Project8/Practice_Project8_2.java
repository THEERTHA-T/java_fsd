//implementing polymorphism
package assistedPracticeProject2;

public class Practice_Project8_2 
{
	int length,breadth,side;
	double height,width;
	int result=0;
	void area(int side) //area() with single argument and integer return type
	{
		result=side*side; //calculating area of square
		System.out.println("\nAREA OF SQUARE = "+result); 
	}
	void area(int length,int breadth) //area() with two arguments and integer return type
	{
		result=length*breadth; //calculating area of rectangle
		System.out.println("\nAREA OF RECTANGLE = "+result);
	}
	void area(double height,double width) //area() with two arguments and double return type
	{
		result=(int)(0.5*height*width); //calculating area of triangle
		System.out.println("\nAREA OF TRIANGLE = "+result);
	}
	public static void main(String[] args) 
	{
		Practice_Project8_2 p1=new Practice_Project8_2();
		p1.area(7);
		p1.area(4,6);
		p1.area(4.5,3.2);
	}

}

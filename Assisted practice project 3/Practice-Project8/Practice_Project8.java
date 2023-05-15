package assistedPracticeProject3;
import java.util.*;

public class Practice_Project8 
{
	private int[] arr; 
	  private int top;

	  public Practice_Project8(int size) //constructor
	  {
	    arr = new int[size]; //initialize
	    top = -1;
	  }

	  public void push(int num) //insert into stack
	  {
	    if (top == arr.length - 1)  //check if stack is full
	    {
	      System.out.println(" => STACK OVERFLOW");
	    } 
	    else 
	    {
	      top++; //after insertion, increment top
	      arr[top] = num;
	    }
	  }
	  
	  public int pop() //delete from stack
	  {
	    if (top == -1) 
	    {
	      System.out.println(" => STACK UNDERFLOW"); //if no element to pop
	      return -1;
	    } 
	    else
	    {
	      int poppeditem = arr[top]; //store popped element
	      top--; //decrease size of stack
	      return poppeditem;
	    }
	  }
	  
	  public void display() //print stack
	  {
		    if (top == -1)
		    {
		      System.out.println("Stack is empty"); //if no element
		    } 
		    else
		    {
		      System.out.print("\nSTACK ELEMENTS : ");
		      for (int i = top; i >= 0; i--)
		      {
		        System.out.print(arr[i] + " ");
		      }
		      System.out.println();
		    }
		  }
 
	    public static void main(String[] args) //main method
	    {
	        int ch,n;
	        Scanner sc=new Scanner(System.in); //create scanner object
	        Practice_Project8 p1=new Practice_Project8(5); //create class object
	        do
	        {
	            System.out.println("\n1.PUSH 2.POP 3.EXIT\n");
	            System.out.println("Enter your choice:");
	            ch=sc.nextInt();
	            switch(ch)
	            {
	                case 1:System.out.println("Enter the Number:");
	                        n=sc.nextInt();
	                        p1.push(n);
	                        p1.display();
	                        break;
	                case 2:int popped=p1.pop();
	                		System.out.println(popped+" is deleted");
	                        p1.display();
	                        break;
	                 case 3:break;
	            }
	       }while(ch!=3);
	    }	
}

//implement queue operations
package assistedPracticeProject3;
import java.util.*;

public class Practice_Project9 
{
	 private static int front, rear, size;   
	    private static int queue[];   
	     
	    Practice_Project9(int size) //constructor
	    {   
	        front = rear = 0;   
	        this.size = size; 
	        queue = new int[size]; 
	    }
	    
	    static void enqueue(int item)  //insertion in queue 
	    {   
	        if (size == rear)  //check if queue is full
	        {   
	            System.out.printf("\nQUEUE IS FULL\n");   
	            return;   
	        }   
	        else 
	        {   
	            queue[rear] = item;    //Inserting item at rear end
	            rear++;   //updating size
	        }   
	        return;   
	    }   
	    
	    static void dequeue()  //deletion in queue
	    {   
	        if (front == rear)//check if queue is empty 
	        {   
	            System.out.printf("\nQUEUE IS EMPTY\n");   
	            return;   
	        }   
	        else 
	        {   
	            for (int i = 0; i < rear - 1; i++) {   
	                queue[i] = queue[i + 1];   
	            }   
	     
	        if (rear < size)  
	        {
                queue[rear] = 0; 
	            rear--;   
	        }
	        }   
	        return;   
	    }   
	     
	    static void display()   //print queue
	    {   
	        int i;   
	        if (front == rear) 
	        {   
	            System.out.printf("\nQUEUE IS EMPTY\n");   
	            return;   
	        } 
	        System.out.println("\nQUEUE ELEMENTS ARE ");
	        for (i = front; i < rear; i++) //traversing through queue
	        {   
	            System.out.printf(queue[i]+" ");   
	        }   
	        return;   
	    }   
	     
	      
	public static void main(String[] args) 
	{
		 	int ch,n;
	        Scanner sc=new Scanner(System.in);
	        Practice_Project9 q=new Practice_Project9(5);
	        do
	        {
	            System.out.println("\n\n1.ENQUEUE  2.DEQUEUE  3.EXIT\n");
	            System.out.println("Enter your choice:");
	            ch=sc.nextInt();
	            switch(ch)
	            {
	                case 1:System.out.println("Enter the Number:");
	                        n=sc.nextInt();
	                        q.enqueue(n);
	                        q.display();
	                        break;
	                case 2: q.dequeue();
	                		q.display();
	                        break;
	                 case 3:break;
	            }
	       }while(ch!=3);
	    }
	
}

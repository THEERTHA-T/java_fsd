//delete first node in singly linked list
package assistedPracticeProject3;
public class Practice_Project5 
{  
    class Node //node of singly linked list
    {  
        int data;  
        Node next;  
        public Node(int data) 
        {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public Node head = null; //head of list 
    public Node tail = null; //tail of list
  
    public void insert(int data) //insert node
    {  
        Node newNode = new Node(data);  //create new node
  
        if(head == null) //if list is empty
        {  
            head = newNode;  //head point to new node
            tail = newNode;  //tail point to new node
        }  
        else 
        {  
            tail.next = newNode;  //tail's next point to new node
            tail = newNode;  
        }  
    }  
  
    public void deleteStart() //delete from beginning
    {  
        if(head == null) //if list is empty
        {  
            System.out.println("List is empty");  
            return;  
        }  
        else 
        {  
            if(head != tail) //if only more than one node
            {  
                head = head.next;  
            }  
            else //if only one node
            {  
                head = tail = null;  
            }  
        }  
    }  
  
    public void display() 
    {  
        Node current = head;  
        if(head == null) 
        {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) 
        {  
            System.out.print(current.data + " ");  //print next node
            current = current.next;  
        }  
        System.out.println();  
    }  
  
    public static void main(String[] args) 
    {  
  
    	Practice_Project5 ll = new Practice_Project5();  //creating object for class
  
    	//insertion
        ll.insert(10);  
        ll.insert(11);  
        ll.insert(14);  
        ll.insert(16);  
        ll.insert(12);  
  
        System.out.println("\nLINKED LIST ");  
        ll.display();  
        
        ll.deleteStart();//deleting first node
        
        //Printing updated list  
        System.out.println("\nLINKED LIST AFTER DELETING FIRST NODE ");  
        ll.display();  
    }  
} 
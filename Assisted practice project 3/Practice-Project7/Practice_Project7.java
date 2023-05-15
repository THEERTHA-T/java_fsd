package assistedPracticeProject3;

public class Practice_Project7 
{
	Node head; 
	class Node //class node
	{ 
    		int data; 
    		Node prev; 
    		Node next; 
    		Node(int d) //constructor
    		{ 
    			data = d; 
    		} 
	}
	public void insertion(int new_data) //inserting to list
		{ 
			Node new_Node = new Node(new_data); //new node creation
			new_Node.next = head; 
    		new_Node.prev = null; 
    		if (head != null)  //check if item exist
        			head.prev = new_Node; 
    				head = new_Node; 
		} 
	
	public void traverse(Node node) 
	{ 
    		Node last = null; 
    		System.out.println("TRAVERSAL IN FORWARD DIRECTION"); 
    		while (node != null) 
    		{ 
        			System.out.print(node.data + " "); 
        			last = node; 
        			node = node.next; 
    		} 
    		System.out.println(); 
    		System.out.println("\nTRAVERSAL IN BACKWARD DIRECTION"); 
    		while (last != null) 
{ 
        			System.out.print(last.data + " "); 
        			last = last.prev; 
    		} 
	}
	public static void main(String[] args) 
		{
			Practice_Project7 dll = new Practice_Project7();
			System.out.println("\nDOUBLY LINKED LIST\n");
			dll.insertion(2);
			dll.insertion(17);
			dll.insertion(4);
			dll.insertion(22);
			dll.insertion(5);
			dll.insertion(1); 
    		dll.traverse(dll.head); 
	} 
} 



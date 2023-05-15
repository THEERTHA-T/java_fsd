//inserting value in circular linked list
package assistedPracticeProject3;
public class Practice_Project6
{
    	static class Node 
    	{ 
    		int data; //data part of the node
    		Node link; //address part of the node
    		Node(int data) 
    		{
    			this.data=data;
    			link=null;
    		}
    	}
    	
    	Node head;
    	Practice_Project6() //constructor
    	{
    		head=null;
    	}
 
    	void insertion(Node new_node) //insertion into list
    	{ 
        		Node current = head;  //assign current as head
        		if (current == null)  //if no node exist
        		{ 
            			new_node.link = new_node; 
            			head = new_node; 
  		} 
        		else if (current.data >= new_node.data)  //check if new data is lesser than current node
        		{ 
        			while (current.link != head) 
                			current = current.link; 
        					current.link = new_node; 
        					new_node.link = head; 
        					head = new_node; 
        		} 
        		else
        		{
        			while (current.link != head && current.link.data < new_node.data) 
                			current = current.link; 
        					new_node.link = current.link; 
        					current.link = new_node; 
        		} 
    	}
    	void display() 
    	{ 
        		if (head != null) 
       		{ 
            			Node temp = head; 
            			do
            			{ 
                			System.out.print(temp.data + " "); 
                			temp = temp.link; 
            			}  while (temp != head); 
        		} 
    	}
	public static void main(String[] args) 
    	{ 
				Practice_Project6 cll = new Practice_Project6(); 
        		int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
        		Node temp = null; 
        		for (int i = 0; i < 6; i++) 
        		{ 
           			temp = new Node(arr[i]); 
            		cll.insertion(temp); 
        		} 
        		System.out.println("--CIRCULAR LINKED LIST--\n");
        		cll.display(); 
        		
    	}		 
	}

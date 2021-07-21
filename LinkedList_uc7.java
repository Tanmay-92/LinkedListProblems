package LinkedList_Problems;

public class LinkedList_uc7 {
	 class Node{  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	            this.next = null;  
	        }  
	    }  
	  
	    public Node head = null;  
	    public Node tail = null;  
	  
	    public void NewNode(int data) {  
	     
	        Node Node1 = new Node(data);  
	       
	        if(head == null) {  
	         
	            head = Node1;  
	            tail = Node1;  
	        }  
	        else {     
	        	tail.next = Node1;  
	           
	            tail = Node1;  
	        }  
	    }  
	   
	    public void findNode(int data) {  
	        Node current = head;  
	        int i = 1;  
	        boolean Pointer = false;  
	        
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	            while(current != null) {    
	                if(current.data == data) {  
	                    Pointer = true;  
	                    break;  
	                }  
	                i++;  
	                current = current.next;  
	            }  
	        }  
	        if(Pointer)  
	             System.out.println("Element is present in the list at the position : " + i);  
	        else  
	             System.out.println("Element is not present in the list");  
	    }  
	  
	    public static void main(String[] args) {  
	  
	        LinkedList_uc7 newList = new LinkedList_uc7();  
	  
	  
	        newList.NewNode(56);  
	        newList.NewNode(30);  
	        newList.NewNode(70);  
	        newList.findNode(30);  
	        
	    }
}

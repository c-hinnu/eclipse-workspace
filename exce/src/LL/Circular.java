package LL;

public class Circular {
	
	 public class Node{  
	        int data;  
	        Node next;  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	 public Node head = null;  
	    public Node tail = null; 
	    public void add(int data){  
	        
	        Node newNode = new Node(data);  
	          
	        if(head == null) {  
	               
	            head = newNode;  
	            tail = newNode;  
	            newNode.next = head;  
	        }  
	        else {  
	             
	            tail.next = newNode;  
	              
	            tail = newNode;  
	             
	            tail.next = head;  
	        }  
	    }  
	  
	     
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	        }  
	        else {  
	              
	             do{  
	                 
	                System.out.print(" "+ current.data+"\n");  
	                current = current.next;  
	            }while(current != head);  
	            System.out.println();  
	        }  
	    }  
	  
	public static void main(String[] args) {
		Circular cl = new Circular();  
         
        cl.add(6);  
        cl.add(7);  
        cl.add(8);  
        cl.add(9);  
        
        cl.display();  
    }  
 
		

	}



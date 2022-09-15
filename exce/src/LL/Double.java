package LL;

public class Double {

	class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) 
        {    
            this.data = data;    
        }    
    }
	Node head = null;  
    Node tail = null;    
    public void addNewNode(String data) {    
   
        Node newNode = new Node(data);    
    
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
               
            head.prev = null;    
              
            tail.next = null;    
        }  
        
        else {    
  
  
            tail.next = newNode;    
       
            newNode.prev = tail;    
               
            tail = newNode;    
                
            tail.next = null;    
        }    
    }  
    public void showData() {  
            
        Node current = head;    
          
        if(head == null) {  
              
            System.out.println("List is empty");    
            return;    
        }  
          
       
          
        while(current != null) {    
                
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    
  
	public static void main(String[] args) {
		 Double obj = new Double();    
		  
	        
	        obj.addNewNode("aaa");    
	        obj.addNewNode("aaa");    
	        obj.addNewNode("ccc");    
	        obj.addNewNode("ddd");    
	        obj.addNewNode("eeesad");    
	  
	           
	        obj.showData();    
	    }    
	  

	}



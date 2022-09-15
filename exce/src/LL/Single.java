package LL;


public class Single 
	{  
      Node head;  
	 static class Node {  
		          int data;  
		         Node next;  
		 Node(int d)  
		 { data = d;  
		 next=null; 
		 }  
		     }
		 public void display()  
	     {  
	         Node n = head;  
	 while (n != null)  
	         {  
	 System.out.print(n.data+" \n");  
	             n = n.next;  
	         }  
	     }  

	public static void main(String[] args) {
		 Single list = new Single();  
		  
		 list.head       = new Node(7);  
         Node second      = new Node(8);  
         Node third       = new Node(9);  
         Node fourth      =new Node(10);
  
 list.head.next = second; 
 second.next = third; 
 third.next= fourth;
 list.display();  
     }  
 
	
	}

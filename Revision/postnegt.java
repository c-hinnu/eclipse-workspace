package Revision;

import java.util.Scanner;

public class postnegt {

	public static void main(String[] args) {
		  int a;
		  Scanner s=new Scanner(System.in);
		  System.out.println("enter number");
		  a=s.nextInt();
		  if(a>0)
		  {
			  System.out.println("it is a positive number");
		  }
		  else if(a<0)
		  {
			System.out.println("it is a negative number"); 
		  }

	}

}

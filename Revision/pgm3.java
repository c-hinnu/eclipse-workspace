package Revision;

import java.util.Scanner;
import java.util.*;

public class pgm3 {

	public static void main(String[] args) {
		 String original,Reverse="";
	        Scanner in = new Scanner (System.in);
	        
	        System.out.println("Enter a string to reverse: ");
	        original = in.nextLine();
	        
	        int length = original.length();
	        
	        for(int i=length-1;i>=0;i--) {
	            Reverse = Reverse + original.charAt(i);
	        }
	        if(original.compareTo(Reverse)==0)
	        {
	        System.out.println("palindrome");
	        }
	        else
	        {
	        	System.out.println("not palindrome");
	        }

	}

}

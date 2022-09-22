package Revision;

import java.util.Scanner;

public class pgm4 {

	public static void main(String[] args) {
		 String s="hi i am chinnu" ;
	        
	        String a[]=s.split(" ");
	        String l=a[0];
	        String sm=a[0];
	        for(int k=1;k<(a.length);k++)
	        {
	            if(sm.length()>=a[k].length())
	                sm=a[k];
	            if(l.length()<=a[k].length())
	                l=a[k];
	        }
	        System.out.println("largest is: "+l);
	        System.out.println("smallest is: "+sm);



	   }



	}
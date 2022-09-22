package Revision;

import java.util.Scanner;

public class pgm2 {

	public static void main(String[] args) {
		int y;
		System.out.println("enter year");
		Scanner s=new Scanner (System.in);
		y=s.nextInt();
       if(y%4==0 && y%100!=0)
       {
    	   System.out.println("leap year");
       }
       else if(y%400==0)
       {
    	   System.out.println("leap year");
       }
       else
       {
    	   System.out.println("not leap year");
       }
	}

}

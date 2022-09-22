package Revision;

import java.util.Scanner;

public class smallter {

	public static void main(String[] args) {
		int a1,a2,a3,temp,small;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a1=s.nextInt();
		System.out.println("enter second number");
		a2=s.nextInt();
		System.out.println("enter third number");
		a3=s.nextInt();
		temp=a1<a2?a1:a2;
	    small = a3<temp?a3:temp;
	    System.out.println(small+" is the smallest number");



	   }
	
	}



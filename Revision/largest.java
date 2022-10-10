package Revision;

import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		int a1,a2,a3;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a1=s.nextInt();
		System.out.println("enter second number");
		a2=s.nextInt();
		System.out.println("enter third number");
		a3=s.nextInt();
		if(a1>a2 && a1>a3)
		{
			System.out.println("largest is"+a1);
		}
		else if(a2>a1 && a2>a3)
		{
			System.out.println("largest is"+a2);
		}
		else
		{
			System.out.println("largest is"+a3);
		}
		
	}

}

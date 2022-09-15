package hello;

import java.util.Scanner;

public class great {

	public static void main(String[] args) {
		 int x,y,z;
	       Scanner s=new Scanner(System.in);
			System.out.println("enter first");
			x=s.nextInt();
			Scanner sc=new Scanner(System.in);
			System.out.println("enter second");
			y=sc.nextInt();
			Scanner sca=new Scanner(System.in);
			System.out.println("enter third");
			z=sca.nextInt();
			if(x>y && x>z)
			{
				System.out.println(x+"is greatest");
			}
			if(y>x && y>z)
			{
				System.out.println(y+"is greatest");
			}
			else
			{
				System.out.println(z+"is greatest");
			}
			
			

	}}
	



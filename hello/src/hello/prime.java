package hello;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int num,i,flag=0;
		  Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			num=s.nextInt();
			if(num==0 || num==1)
			{
				flag=1;
			}
		for(i=2;i<=num/2;i++)
			if(num%i==0)
			{
				flag=1;
			}

	if(flag==0) {
		System.out.println("prime");
	}
	else
	{
		System.out.println("not");	
	}
}}

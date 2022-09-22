package Revision;

import java.util.Scanner;

public class palin {

	public static void main(String[] args) {
		int n,r,temp,res=0;
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			res=res*10+r;
			temp=temp/10;
			
			
		}
		if(res==n)
		{
			System.out.println("pallindrome");
		}
		else
		{
			System.out.println("not pallindrome");
		}

	}



	}



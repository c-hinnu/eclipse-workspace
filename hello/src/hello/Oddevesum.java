package hello;

import java.util.Scanner;

public class Oddevesum {

	public static void main(String[] args) {
		int i,n,os=0,es=0;
		System.out.println("limit");
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();		
	   
		int num[]=new int[n];
		System.out.println("enter no");
		
		for(i=1;i<n;i++) {
			
			num[i]=sc.nextInt();
			
		}

		for(i=0;i<n;i++)
		{
			if(num[i]%2==0)
			{
			es=es+i;	
			}
			else
			{
				os=os+i;
			}
		}
		System.out.print("even sum"+es);
		System.out.print("odd sum"+os);
		
		

	}

}

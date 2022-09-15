package hello;

import java.util.Scanner;

public class Largsmall {

	public static void main(String[] args) 
		
		{
			int num[]=new int[4];
			int i;
			int larg=0;
			int small=100;
			Scanner sc=new Scanner(System.in);
			
			for(i=0;i<4;i++) {
				num[i]=sc.nextInt();
				
			}
			for(i=0;i<4;i++)
			{
				if(num[i]>larg)
				{
					larg=num[i];
				}
				if(num[i]<small)
				{
					small=num[i];
				}
			}
     System.out.println("largest is"+larg);
     System.out.println("smallest"+small);
     
		}}



package hello;

import java.util.Scanner;

public class Searcharray {

	public static void main(String[] args) {
	
		{
			int num[]=new int[4];
			int i,number,f=0;
			Scanner sc=new Scanner(System.in);
			
			for(i=0;i<4;i++) {
				num[i]=sc.nextInt();
				
			}
			Scanner s=new Scanner(System.in);
			System.out.println("enter number");
			number=s.nextInt();
			for(i=0;i<4;i++)
			{
				if(num[i]==number)
				{
					f=1;
				}
			}
			
				if(f==1)
				{
					System.out.println("found");
				}
				else
				{
					System.out.println("not found");
				}
			}
		}
	}
			
				
			
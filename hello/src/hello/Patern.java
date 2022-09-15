package hello;

import java.util.Scanner;

public class Patern {

	public static void main(String[] args) {
		int i,num,n=10;
		float avg,sum=0;
		Scanner s=new Scanner(System.in);
		for(i=1;i<=10;i++)
		{
		num=s.nextInt();
		sum=sum+num;
		
		}
		System.out.println("sum is"+sum);
		avg=sum/n;
		System.out.println("average is"+avg);
		
		
		

	}

}

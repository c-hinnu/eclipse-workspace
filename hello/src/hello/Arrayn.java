package hello;

import java.util.Scanner;

public class Arrayn {

	public static void main(String[] args) {
		int num[]=new int[10];
		int i;
		Scanner sc=new Scanner(System.in);
		
		for(i=0;i<10;i++) {
			num[i]=sc.nextInt();
			
		}
		for(i=0;i<10;i++)
		{
			System.out.println(num[i]);
		}

	}

}

package hello;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int i,fact=1,number;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		number=s.nextInt();
		for(i=1;i<=number;i++)
		{
			fact=fact*i;
		}
  System.out.println("factorial is"+fact);
	}

}

package moc;

import java.util.Scanner;

public class switchtemp {

	public static void main(String[] args) {
		int m;
		float n1,n2,n3;
		Scanner s=new Scanner(System.in);
		System.out.println("enter temperature");
		n1=s.nextFloat();
		System.out.println("enter option");
		m=s.nextInt();
		switch(m)
		{
		case 1:n2=(n1*9/5)+32;
		       System.out.println("farenheit is"+" "+n2);
		       break;
		case 2:n3=(n1-32)*5/9;
	       System.out.println("celsius is"+" "+n3);
	       break;
		}

	}

}

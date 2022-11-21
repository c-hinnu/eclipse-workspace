package moc;

import java.util.Scanner;

public class switchnew {

	public static void main(String[] args) {
		int n1,n2,m;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		n1=s.nextInt();
		System.out.println("enter second number");
		n2=s.nextInt();
		System.out.println("enter number");
		m=s.nextInt();
		switch(m) 
		{
		case 1:System.out.println("sum is");
		      System.out.println(n1+n2);
	       break;
	case 2:System.out.println("difference is");
		System.out.println(n1-n2);
    break;
	case 3:System.out.println("product is");
		System.out.println(n1*n2);
    break;
	case 4:System.out.println("quotient is");
		System.out.println(n1/n2);
    break;
	case 5:System.out.println("reminder is");
		System.out.println(n1%n2);
    break;
		}

	}

}

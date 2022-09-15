package hello;

import java.util.Scanner;

public class Day {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		n=s.nextInt();
		switch(n) 
		{
		case 1:System.out.println("mon");
		       break;
		case 2:System.out.println("tue");
	       break;
		case 3:System.out.println("wed");
	       break;
		case 4:System.out.println("thu");
	       break;
		case 5:System.out.println("fri");
	       break;
		case 6:System.out.println("sat");
	       break;
		case 7:System.out.println("sun");
	       break;
	       default:System.out.println("invalid");
	       break;

	}

}}

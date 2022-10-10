package Revision;
import java.util.*;

public class Swapbit {

	public static void main(String[] args) {
		int a,b;
		System.out.println("enter first number");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		System.out.println("enter second number");
	    b=s.nextInt();
	    System.out.println("before swap a="+a+" "+"b="+b);
	    a=a^b;
	    b=a^b;
	    a=a^b;
		System.out.println("after swap a="+a+" "+"b="+b);
		
		

	}

}

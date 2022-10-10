package Revision;

public class Swap {

	public static void main(String[] args) {
		int a=23;
		int b=34;
		System.out.println("before swap a="+a+" "+"b="+b);
       a=a+b;
       b=a-b;
       a=a-b;
   	System.out.println("after swap a="+a+" "+"b="+b);
	}

}

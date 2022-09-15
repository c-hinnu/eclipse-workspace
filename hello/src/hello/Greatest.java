package hello;
import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
       int x,y;
       Scanner s=new Scanner(System.in);
		System.out.println("enter first");
		x=s.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter second");
		y=sc.nextInt();
		if(x>y) {
			System.out.println(x+"is greater");
		}
		else
		{
			System.out.println(y+"is greater");
		}

	}

}

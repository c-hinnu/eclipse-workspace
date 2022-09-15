package hello;
import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		age=s.nextInt();
		if(age>18) {
		System.out.println("eligible");
		}
		else
		{
			System.out.println("not");
		}
		
		

	}

}

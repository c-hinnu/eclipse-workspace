package hello;
import java.util.Scanner;

public class Primefactor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter");
		int x=s.nextInt();
		for(int i=2;i<x;i++)
		{
		while(x%i==0)
		{
			System.out.println(i);
			x=x/i;
		}
	}
		if(x>2) {
			System.out.println(x);
			
		}
		

	}

}

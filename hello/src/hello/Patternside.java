package hello;
import java.util.Scanner;


public class Patternside {

	public static void main(String[] args) {
		int i,j;
		Scanner scn=new Scanner(System.in);
		System.out.println("enter rows");
		int a=scn.nextInt();
		for(i=1;i<a+1;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(" * ");
				
			}
			System.out.println();
			}
		for(i=a-1;i>0;i--)
		{
			for(j=1;j<=i;j++)
			{
				
			}
			System.out.print(" * ");
		}
		System.out.println();
		
		

	}

}


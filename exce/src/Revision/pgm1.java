package Revision;
import java.util.Scanner;

public class pgm1 {

	public static void main(String[] args) {
		int age;
		char sex,mar;
		
		System.out.println("enter age");
		Scanner s=new Scanner (System.in);
		age=s.nextInt();
		System.out.println("enter sex");
		sex=s.next().charAt(0);
		System.out.println("enter marital sts");
		mar=s.next().charAt(0);
				if(sex=='f')
		{
			System.out.println("in urban areas");
		}
		else if(sex=='m' && age>20 && age<40 )
		{
			System.out.println("work anywhere");
			
		}
		else if(sex=='m' && age>40 && age<60 ) 
		{
			System.out.println("work in urban areas");
			
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}
		
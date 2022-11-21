package moc;
import java.util.*;

public class Robert {

	public static void main(String[] args) {
		int a,b,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
        System.out.println("enter second number");
		b=s.nextInt();
		for(int i=1;i<=a || i<=b ;i++)
		{
		if(a%i==0 && b%i==0)
		{
			c=c+1;
		}}
		System.out.println("count is"+" "+" "+c);
}}

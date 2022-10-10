package Revision;
import java.util.*;

public class gcd {

	public static void main(String[] args) {
		int n1,n2,i,gcd=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		n1=s.nextInt();
		System.out.println("enter second number");
		n2=s.nextInt();
		for(i=1; i<=n1 && i<=n2; i++)
		{
			if(n1%i==0 && n2%i==0)
		     gcd=i;
		}
		System.out.println("gcd of"+" "+n1+" "+"and"+" "+n2+" "+"is"+" "+gcd);
		



	}

}

package moc;
import java.util.*;

public class Arrayofinteger {

	public static void main(String[] args) {
		int n,b;
		System.out.println("enter limit");
		Scanner s=new Scanner(System.in);
		
		n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int k=0;k<n;k++)
		{
			a[k]=s.nextInt();
		}
		System.out.println("enter input");
		b=s.nextInt();
		
		
		
		
	   for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++) 
			{
		 
				if(a[i]+a[j]==b)
				{
					System.out.println(a[i]+"\t"+a[j]);
				}
				
			}
		}
		
		

	}

}

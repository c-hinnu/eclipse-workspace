package moc;
import java.util.*;

public class Cumulative {

	public static void main(String[] args) {
		System.out.println("enter no of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<=i;j++)
			{
				sum=sum+a[j];
				
			}
			System.out.print(sum+" ");
		}

	}

}

package moc;

import java.util.Scanner;
import java.util.*;

public class Ascii {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		int a[]=new int[4];
		for(int i=0;i<4;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]+"-"+(char)a[i]);
		}
		
     
       
	}

}

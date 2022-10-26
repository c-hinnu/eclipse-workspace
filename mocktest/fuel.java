package mocktest;

import java.util.Scanner;

public class fuel {

	public static void main(String[] args) {
		float x,z,y;
		double c,t,r;
		
		System.out.println("enter no of liters to fill tank");
		Scanner sca=new Scanner (System.in);
		x=sca.nextInt();
	
		
		if(x<0)
		{
			System.out.println(x+"is an invalid input");
			
		}
		else {
			
			
			System.out.println("enter the distance covered");
			z=sca.nextInt();
			if(z<0)
			{
				System.out.println(z+"is an valid input");
		
			}
			else
			{
				y=(x/z)*(100);
				System.out.println("liters/100km");
				
				System.out.printf("%.2f",y);
				System.out.println();
				c=(x*0.2642);
				t=(z*0.6214);
				r=t/c;
				System.out.println("miles/gallons");
				System.out.printf("%.2f",r);
			}
			
		}
		
	
	

	}

}

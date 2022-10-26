package mocktest;

import java.util.Scanner;

public class bill {

	public static void main(String[] args) {
		int pi,pu,cl,pit,put,clt,t;
		System.out.println("enter no of pizza");
		Scanner sca=new Scanner (System.in);
		pi=sca.nextInt();
		System.out.println("enter no of puffs");
		pu=sca.nextInt();
		System.out.println("enter no of cool drinks");
		cl=sca.nextInt();
		pit=pi*100;
		put=pu*20;
		clt=cl*10;
		t=pit+put+clt;
				
		System.out.println("total price"+" "+t);
		System.out.println("ENJOY THE SHOW");

	}

}

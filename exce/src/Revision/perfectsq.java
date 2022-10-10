package Revision;
import java.util.*;

public class perfectsq {

	public static void main(String[] args) {
		    int n,i;
	        double sq;
	        Scanner c = new Scanner(System.in);
	        System.out.println("Enter a number");
	        n= c.nextInt();
	        sq=Math.sqrt(n);
	        if((sq - Math.floor(sq)) == 0)
	        {
	            System.out.println("perfect square");
	        }
	        else 
	        {
	            System.out.println("not perfect square");
	        }
	    }
	

	}



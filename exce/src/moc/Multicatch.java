package moc;
import java.util.*;


public class Multicatch {
	public String getpricedetails() {
    int n;
		System.out.println("enter limit");
		Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements");
		for(int k=0;k<n;k++)
		{
			a[k]=s.nextInt();
		}
		 
		 try
		 {
			 System.out.println("enter index");
		 int m=s.nextInt();
		 
		return("the array element is:"+a[m]);
		  }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
		        return("the array index outof range");
		     } 
		 catch (InputMismatchException e) 
		 {
		        return("Input was not in the correct format");
		     }}
	

	public static void main(String[] args) {
		Multicatch b= new Multicatch();
		System.out.println(b.getpricedetails());
		
	
				 
		 }
		 
	}



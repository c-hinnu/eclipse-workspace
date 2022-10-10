package exam;
import java.util.Scanner;

public class quest1 {

	public static void main(String[] args) {
		  int r1,c1,r2,c2;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter number of rows of first matrix");
	        r1=sc.nextInt();
	        System.out.println("enter number of cols of first matrix");
	        c1=sc.nextInt();
	        System.out.println("enter number of rows of Second matrix");
	        r2=sc.nextInt();
	        System.out.println("enter number of cols of Second matrix");
	        c2=sc.nextInt();
	        int a[][]=new int[r1][c1];        
	        int b[][]= new int[r2][c2];
	        if(r1==r2 && c1==c2)
	        {
	        System.out.println("enter the values of First matrix in row order");
	        for(int i=0;i<r1;i++)
	        {
	            for(int j=0;j<c1;j++)
	            {
	                int q=sc.nextInt();
	                a[i][j]=q;
	            }
	        }
	        System.out.println("enter the values of Second matrix in row order");
	        for(int i=0;i<r2;i++)
	        {
	            for(int j=0;j<c2;j++)
	            {
	                int q=sc.nextInt();
	                b[i][j]=q;
	            }
	        }
	        
	            for(int i=0;i<r1;i++)
	            {
	                for(int j=0;j<c1;j++)
	                {
	                    a[i][j]=a[i][j]+b[i][j];
	                }
	            }
	            System.out.println("Resultant Matrix ");
	            for(int i=0;i<r1;i++)
	            {
	                for(int j=0;j<c1;j++)
	                {
	                    System.out.print(a[i][j]+" ");
	                }
	                System.out.println();
	            }
	        }
	        else
	        {
	            System.out.println("Cant Add these Matrices ");
	        }



	   }



	}
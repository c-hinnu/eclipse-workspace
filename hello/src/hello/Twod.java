package hello;
import java.util.Scanner;

public class Twod {

	public static void main(String[] args) {
		
	   int n[][]=new int[3][3];
		int i,j;
		Scanner c=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				n[i][j]=c.nextInt();
			}
		}
		
		System.out.println("array is");
		{
			for(i=0;i<3;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.print(" "+n[i][j]);
				}
				System.out.println();
			}
		}
		

	}

}

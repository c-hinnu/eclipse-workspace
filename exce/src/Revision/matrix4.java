package Revision;

public class matrix4 {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) 
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					
					  c[i][j]+=a[i][j]*b[i][j];
				
			}
				System.out.print(c[i][j]+" ");
			
		}
			System.out.println();
				
		
			
		}



	}}



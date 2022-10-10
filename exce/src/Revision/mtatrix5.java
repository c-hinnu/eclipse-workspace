package Revision;

public class mtatrix5 {

	public static void main(String[] args) {
		int a[][]= {{4,5,7},{7,8,8},{11,12,13}};
		int b[][]= {{4,5,7},{7,8,8},{11,12,13}};
		int r1,r2,c1,c2;
		int flag=0;
		r1=a.length;
		c1=a[0].length;
		r2=b.length;
		c2=b[0].length;
		if(r1!=r2 || c1!=c2)
		{
			System.out.println("no equal");
		}
		else
		{
			for(int i=0;i<r1;i++) 
			{
				for(int j=0;j<c1;j++)
				{
					if(a[i][j]!=b[i][j]) {
						
						flag=1;
						break;
					}
						
				}
		}
		
		if(flag==0)
		{
			System.out.println("are equal");
		}
		else
		{
			System.out.println("not equal");
		}
		

	}}}



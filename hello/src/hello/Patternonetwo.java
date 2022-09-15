package hello;

public class Patternonetwo {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++)
		{
			if(i==2)
			{
				System.out.print((i)+" "+(i-1));
				System.out.println();
				
			}
			else
			{
				for(int j=1;j<=3;j++)
				{
					System.out.print(i+" "+j);
					System.out.println();	
				}
			}
		}

	}

}

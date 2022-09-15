package exce;

public class Multi {

	public static void main(String[] args) {
		try {
			int ar[]=new int[4];
			ar[4]=10/0;
			}
		catch(ArithmeticException e)
		{
			System.out.println("Arith exception");
		}
	   catch(ArrayIndexOutOfBoundsException e)
			{
		   System.out.println("Array index out of bound");
			}
			catch(Exception e)
			{
				System.out.println("rest");
			}
	}


	



	}



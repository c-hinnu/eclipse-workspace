package exce;

public class Numforexc {

	public static void main(String[] args) {
		try
		{
			int num=Integer.parseInt("a");
			System.out.println(num);
			
		}
		catch(NumberFormatException e)

		{
			System.out.println("number format exception");
		}
		finally
		{
			System.out.println("anyways");
		}
	}

}

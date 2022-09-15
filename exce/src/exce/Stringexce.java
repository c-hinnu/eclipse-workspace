package exce;

public class Stringexce {

	public static void main(String[] args) {
		try
		{
			String s="chinnu";
			char c=s.charAt(8);
			System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("outbound");
		}
        finally
        {
        	System.out.println("print anyways");
        }
	}

}

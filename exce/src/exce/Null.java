package exce;

public class Null {

	public static void main(String[] args) {
		String s=null;
		try
		{
			System.out.println("first"+s.charAt(0));
		}
		catch(NullPointerException e) {
			System.out.println("null point exception occurs");
		}

	}




	}



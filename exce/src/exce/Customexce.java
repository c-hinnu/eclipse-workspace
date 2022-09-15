package exce;
class Myexception extends Exception{
	
}
class Customexce {

	public static void main(String[] args) {
		
try
{
	throw new Myexception();
}
catch(Myexception e)
{
	System.out.println("caught exception");
	System.out.println(e);
}
	}

}

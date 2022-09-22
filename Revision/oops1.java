package Revision;
abstract class Parent
{
	public abstract void message() ;
	
}
class First extends Parent
{
	public void message()
	{
		System.out.println("this is first");
	}
}
class Second extends Parent
{
	public void message()
	{
		System.out.println("this is second");
	}
}


public class oops1 {

	public static void main(String[] args) {
		First f=new First();
		f.message();
		Second s=new Second();
		s.message();
		
	}

}

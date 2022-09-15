package hello;
class Ay
{
	static void disp()
	{
		System.out.println("parent");
	}
}
class Cy extends Ay 
{
	static void disp()
	{
		System.out.println("child");
	}
}
public class Tenth {

	public static void main(String[] args) {
		Ay a=new Ay();
		Cy c=new Cy();
		a.disp();
		c.disp();
		Ay ay =new Cy();
		ay.disp();
	}

}

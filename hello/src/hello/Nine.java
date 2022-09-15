package hello;
class A{
	int i;
	void printnum()
	{
	System.out.println(i);
	}
}
class B extends A{
	int j;
	void printnum()
	{
	System.out.println(j);
	}
}
public class Nine {

	public static void main(String[] args) {
		B b=new B();
		b.i=4;
		b.j=9;
		b.printnum();

	}

}

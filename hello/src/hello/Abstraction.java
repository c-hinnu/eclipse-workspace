package hello;
abstract class Cl{
	public void a() {
		System.out.println("a");
	}
	public abstract void b();
	public abstract void c(); 
}
abstract class Dl extends Cl{
	public void b() {
		System.out.println("b");
	}
	
}
class E extends Dl{
	public void c() {
		System.out.println("c");
	}
	
}


public class Abstraction {

	public static void main(String[] args) {
	Dl dl=new E();
	dl.a();
	dl.b();
	dl.c();
	

	}

}

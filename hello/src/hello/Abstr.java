package hello;
abstract class Part{
	public void message() {
		System.out.println("mmm");
	}
	 
}
class First extends Part{
	public void message() {
		System.out.println("first");
	}
	
}
class Sec extends Part{
	public void message() {
		System.out.println("second");
	}
	
}

public class Abstr {

	public static void main(String[] args) {
		First f= new First();
		Sec s=new Sec();
		f.message();
		s.message();

	}

}

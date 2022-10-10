package sep17;
interface Pri{
	void display();
}
interface so{
	void display();
}


public class pgm2 implements Pri,so {
	public void display()
	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		pgm2 p=new pgm2();
		p.display();
	

	}

}

package hello;
class Area{
	int c;
	public void rect(int a,int b) {
		c=a*b;
		System.out.println("area of rectangle"+c);
	}
	public void rect(int a) {
		c=a*a;
		System.out.println("area of square"+c);
		
	}
}

public class Sixth {

	public static void main(String[] args) {
	 Area a=new Area();
	 a.rect(3);
	 a.rect(2, 3);

	}

}

package sep17;
interface Manic
{
	public void pro();
}

public class Lamb {

	public static void main(String[] args) {
		int a=5;
		Manic m=()->
		{
		System.out.println("hello"+a);	
		};
		m.pro();

	}

}

package sep17;
interface dro
{
	void dri();
	static int cube(int x)
	{
		return x*x*x;
	}
}
class Rect implements dro
{
	public void dri()
	{
		System.out.println("drawing rectangle");
	}
}

public class pgm4 {

	public static void main(String[] args) {
		dro  dr=new Rect();
		dr.dri();
	System.out.println(dro.cube(2));
	}
		

	}


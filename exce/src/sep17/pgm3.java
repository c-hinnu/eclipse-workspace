package sep17;
interface sam{
	void dis();
}
interface pam extends sam{
	void disp();
}

public class pgm3 implements pam {
	public void dis()
	{
		System.out.println("hey");
	}
	public void disp()
	{
		System.out.println("jan");
	}

	public static void main(String[] args) {
		pgm3 pg=new pgm3();
		pg.dis();
		pg.disp();
		

	}

}

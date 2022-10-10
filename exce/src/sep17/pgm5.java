package sep17;
interface showable
{
	void show();

interface Message
{
	void msg();
}}


public class pgm5 implements showable.Message {
	public void msg()
	{
		System.out.println("hello");
	}
	public void show()
	{
		System.out.println("teams");
	}

	public static void main(String[] args) {
	showable.Message c=new pgm5();
	
	c.msg();
	

	}

}

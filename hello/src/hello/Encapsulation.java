package hello;
class Encaps
{
	private int no;
	private String name;
	public int getno() {
		return no;
	
	}
	public void setno(int no) {
		this.no=no;
		
	}
	public String getname() {
		return name;
	
	}
	public void setname(String name) {
		this.name=name;
		
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Encaps e=new Encaps();
		e.setname("cc");
		e.setno(4);
		System.out.println(e.getname());
		System.out.println(e.getno());
		

	}

}

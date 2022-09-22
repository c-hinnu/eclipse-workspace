package sep17;
 interface show{
	 void sho();
	 static int printable(int s)
	{
		return s*s;
	}
	
}
class b implements show{
	public void sho() {

	System.out.println("hi");
	
}

public class inter2 {

	public static void main(String[] args) {
		 b s=new b();
	    s.sho();
	    System.out.println(show.printable(3));
	   	   
	    

	}

}}

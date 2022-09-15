package hello;
class Degree{
	public void getdegree() {
		System.out.println("i got degree");
	}
}
class Ugrad extends Degree{
	public void disp() {
		System.out.println("i am ug");
	}
}
class Pgrad extends Degree{
	public void disp() {
		System.out.println("i am pg");
	}
}

public class Seventh {

	public static void main(String[] args) {
      Degree d=new Degree();
      Ugrad u=new Ugrad();
      Pgrad p=new Pgrad();
      d.getdegree();
      u.disp();
      p.disp();
      
      
      
      

	}

}

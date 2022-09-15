package exce;

public class classexce {

	public static void main(String[] args) {
	 try {
		 Class.forName("NoclassExist");
	 }
	 catch(ClassNotFoundException e)
	 {
	
		 System.out.println(e);
	 }
	 System.out.println();
	 System.out.println("pgm then continues");
	 }

}

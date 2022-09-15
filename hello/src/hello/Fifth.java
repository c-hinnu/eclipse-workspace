package hello;
class Num{
	public void disp(int n,char c) {
		System.out.println(n+ " " +c);
	}
	public void disp(char c,int n) {
		System.out.println(c+ " " +n);
	}


}

public class Fifth {

	public static void main(String[] args) {
		
		Num n=new Num();
		n.disp(1,'b');
		n.disp('a', 5);

	}

}

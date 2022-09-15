package hello;
class Bank{
	public void getbalance()
	{
	System.out.println(0);
	}
}
class BA extends Bank{
	public void getbalance()
	{
		System.out.println(1000);
	}
	
}
class BB extends Bank{
	public void getbalance()
	{
		System.out.println(1500);
	}
	
}
class BC extends Bank{
	public void getbalance()
	{
		System.out.println(2000);
	}
	
}

public class Eight {

	public static void main(String[] args) {
		Bank b=new Bank();
		BA ba=new BA();
		BB bb=new BB();
		BC bc=new BC();
		b.getbalance();
		ba.getbalance();
		bb.getbalance();
		bc.getbalance();
		
		
		

	}

}

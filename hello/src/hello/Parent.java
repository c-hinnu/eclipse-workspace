package hello;

class Parent1 {
      public void show()
		{
		System.out.println("this is parent class");
		}
	}
class Child extends Parent1{
	
	public void show()
	{
		
		
		System.out.println("this is child class");
		super.show();
	}
}	
public class Parent{
public static void main(String[] args){
	Parent1 p=new Parent1();
	Child c=new Child();
	 
	p.show();
	c.show();

}
}




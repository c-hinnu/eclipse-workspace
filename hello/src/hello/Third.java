package hello;
class Shape{
	public void show()
	{
		System.out.println("this is shape");
	}
}
class Rectangle extends Shape{
	public void display()
	{
		System.out.println("rectangle");
	}
	
}
class Circle extends Shape{
	public void print() 
	{
	System.out.println("circle");
    }
}
class Square extends Rectangle
{
	public void disp() {
		System.out.println("square");
	}

}


public class Third {

	public static void main(String[] args) {
	
		Square sq=new Square();
		sq.show();
		sq.display();

	}

}

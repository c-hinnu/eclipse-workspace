package exam;
import java.util.*;
public class Fruit {

	public static void main(String[] args) {
	   ArrayList<String> a = new ArrayList<>();
	   a.add("orange");
	   a.add("mango");
	   
	   a.add("kiwi");
	   
	   a.add("apple");
	   
	   a.add("grape");
	   System.out.println(a);
	   Collections.sort(a);
	   System.out.println(a);
	   search(a);
	   
	   

	
}
	
void search( ArrayList<String> a)
{
	if(a.contains("orange"))
	{
		System.out.println("found");
	}
	else
	{
		System.out.println("not");
	}
}}

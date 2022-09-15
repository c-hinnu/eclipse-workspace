package LL;
import java.util.LinkedList;
import java.util.Iterator;

public class Linked2 {

	public static void main(String[] args) {
		LinkedList<String>a = new LinkedList<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}

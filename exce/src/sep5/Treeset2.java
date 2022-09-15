package sep5;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset2 {

	public static void main(String[] args) {
		TreeSet<String>t = new TreeSet<>();
		t.add("pink");
		t.add("black");
		t.add("ash");
		t.add("red");
		t.add("green");
		t.add("blue");
		
		Iterator itr = t.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}






	}



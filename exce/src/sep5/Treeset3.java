package sep5;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class Treeset3 {

	public static void main(String[] args) {
		TreeSet<String>t = new TreeSet<>();
		t.add("pink");
		t.add("black");
		t.add("ash");
		t.add("red");
		
		Iterator itr = t.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}




	}


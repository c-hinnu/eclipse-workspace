package sep5;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset5 {

	public static void main(String[] args) {
		TreeSet<Integer>t = new TreeSet<>();
		TreeSet<Integer>th = new TreeSet<>();
		
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(9);
		t.add(8);
		t.add(10);
		t.add(7);
		th=(TreeSet)t.headSet(7);
		Iterator itr = th.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}







		

	}



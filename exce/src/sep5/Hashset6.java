package sep5;

import java.util.Iterator;
import java.util.HashSet;

public class Hashset6 {

	public static void main(String[] args) {
		HashSet<Integer>t = new HashSet<>();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		System.out.println("list is"+" "+t);
		t.add(9);
		System.out.println("list is"+" "+t);
		
	}
}
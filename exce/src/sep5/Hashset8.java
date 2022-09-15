package sep5;

import java.util.HashSet;

public class Hashset8 {

	public static void main(String[] args) {
		HashSet<String>t = new HashSet<>();
		t.add("a");
		t.add("b");
		t.add("c");
		t.add("d");

		HashSet<String>ta = new HashSet<>();
		ta.add("e");
		ta.add("f");
		ta.add("b");
		ta.add("c");
		t.retainAll(ta);
		System.out.println(t);

	}

}

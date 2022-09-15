package sep5;

import java.util.HashMap;

public class Hashmap6 {

	public static void main(String[] args) {
		HashMap<Integer,String>h1 = new HashMap<>();
		h1.put(1,"a");
		h1.put(2,"b");
		h1.put(3,"c");
		h1.put(4,"d");
		System.out.println("hash map is"+" "+h1);
		HashMap<Integer,String>h2 = new HashMap<>();
		h2=(HashMap)h1.clone();
		System.out.println("shallow copy is"+" "+h2);
		

	}

}

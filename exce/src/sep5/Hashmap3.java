package sep5;

import java.util.HashMap;

public class Hashmap3 {

	public static void main(String[] args) {
		HashMap<Integer,String>hm1 = new HashMap<>();
		hm1.put(1,"a");
		hm1.put(2,"b");
		hm1.put(3,"c");
		hm1.put(4,"d");
		System.out.println("hash map is"+" "+hm1);
		HashMap<Integer,String>hm2 = new HashMap<>();
		hm2.put(1,"e");
		hm2.put(2,"f");
		hm2.put(3,"g");
		hm2.put(4,"h");
		System.out.println("hash map is"+" "+hm2);
		hm2.putAll(hm1);
		System.out.println("hash map is"+" "+hm2);
		
		
		

	}

}

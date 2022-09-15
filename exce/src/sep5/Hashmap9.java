package sep5;

import java.util.HashMap;
import java.util.Set;

public class Hashmap9 {

	public static void main(String[] args) {
		HashMap<Integer,String>c = new HashMap<>();
		c.put(1,"a");
		c.put(2,"b");
		c.put(3,"c");
		c.put(4,"d");
		Set set=c.entrySet();
		System.out.println("set values"+set);
		

	}

}

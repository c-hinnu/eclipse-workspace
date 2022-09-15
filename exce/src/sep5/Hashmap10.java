package sep5;

import java.util.HashMap;

public class Hashmap10 {

	public static void main(String[] args) {
		HashMap<Integer,String>m = new HashMap<>();
		m.put(1,"a");
		m.put(2,"b");
		m.put(3,"c");
		m.put(4,"d");
		System.out.println("hash map is"+" "+m);
	if(m.containsKey(1))
	{
		System.out.println(m.get(2));
	}
	else
	{
		System.out.println("no");
	}
	

	}


	}


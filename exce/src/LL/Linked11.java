package LL;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked11 {

	public static void main(String[] args) {
		LinkedList<String>a = new LinkedList<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		a.remove("cat");
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}



	}


package LL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linked3 {

	public static void main(String[] args) {
		LinkedList<String>a = new LinkedList<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		ListIterator itr = a.listIterator(2);
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}




	}



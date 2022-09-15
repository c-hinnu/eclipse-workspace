package LL;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked9 {

	public static void main(String[] args) {
		LinkedList<String>a = new LinkedList<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		a.add(0,"hhh");
		a.add(1,"hhh");
		a.add(2,"hhh");
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}


	}


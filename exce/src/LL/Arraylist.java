package LL;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		LinkedList<String>a = new LinkedList<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		a.addLast("jamna");
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}




	}







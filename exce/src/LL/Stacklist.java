package LL;

import java.util.Iterator;
import java.util.Stack;

public class Stacklist {

	public static void main(String[] args) {
		Stack<String>a = new Stack<>();
		a.add("dog");
		a.add("cat");
		a.add("fox");
		a.add("cow");
		
		Iterator itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}










	}


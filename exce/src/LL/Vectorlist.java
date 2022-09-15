package LL;

import java.util.Iterator;
import java.util.Vector;

public class Vectorlist {

	public static void main(String[] args) {
		Vector<String>a = new Vector<>();
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

package sep5;

import java.util.PriorityQueue;

public class Priority12 {

	public static void main(String[] args) {
	
		PriorityQueue<String>pr = new PriorityQueue<>();
		PriorityQueue<String>pq = new PriorityQueue<>();
		pr.add("pink");
		pr.add("black");
		pr.add("ash");
		pr.add("red");
		pq.add("green");
		pq.add("ash");
		pq.add("blue");
		pq.add("red");
		System.out.println("First queue is"+pr);
		System.out.println("second queue is"+pq);
		for(String element:pr)
		{
			System.out.println(pq.contains(element) ? "yes" : "No");
		}
	
	}

}

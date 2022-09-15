package sep5;

import java.util.PriorityQueue;

public class Priority13 {

	public static void main(String[] args) {
		PriorityQueue<String>pr = new PriorityQueue<>();
		pr.add("pink");
		pr.add("black");
		pr.add("ash");
		pr.add("red");
		pr.add("blue");
		System.out.println("priority queue is"+" "+pr);
		System.out.println("first element is"+" "+pr.peek());

	}

}

package java8;

import java.util.ArrayList;
import java.util.List;

public class jpgm4 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		int sum=list.stream().mapToInt(i->i.intValue()).sum();
		System.out.println("sum of numbers is"+sum);

	}

}

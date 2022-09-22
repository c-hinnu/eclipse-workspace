package java8;
import java.util.*;

public class jpgm5 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		OptionalDouble av=list.stream().mapToInt(i->i*i).filter(n->(n>100)).average();
		System.out.println("average of numbers is "+av);
		

	}

}

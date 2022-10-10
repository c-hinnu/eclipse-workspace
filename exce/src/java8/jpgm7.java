package java8;
import java.util.Random;

public class jpgm7 {

	public static void main(String[] args) {
		Random r =new Random();
        r.ints().limit(5).forEach(System.out::println);

	}

}

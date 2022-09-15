package hello;
import java.io.File;
import java.util.Scanner;

public class Fileread {

	public static void main(String[] args) {
		try
		{
			File fileobj= new File("example.txt");
			Scanner myreader=new Scanner(fileobj);
		    while(myreader.hasNextLine()) {
		    	String data=myreader.nextLine();
		    	System.out.println(data);
		    	
		    }
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}

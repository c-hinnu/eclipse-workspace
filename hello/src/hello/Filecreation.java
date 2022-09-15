package hello;
import java.io.File;
import java.io.IOException;


public class Filecreation {

	public static void main(String[] args)  {
		
		File fileobj=new File("example.txt");
		try
		{
			//int d=1/0;
		boolean success=fileobj.createNewFile();
		if(success) {
			System.out.println("file created");
			}
		else
		{
			System.out.println("file already exist");
		}
		
		}catch (IOException e) {
			System.out.println(e);
		}

	}

}

package hello;
import java.io.File;
public class Filedeletion {

	public static void main(String[] args) {
		try
		{
			File f=new File("example.txt");
			if(f.delete()) {
				System.out.println(f.getName() + "has been deleted");
			}
			else
			{
				System.out.println("deletion failed");
			}
		}catch(Exception e) {
			System.out.println(e);
		}


	}

}

package hello;

import java.io.FileWriter;

public class Filewrite {

	public static void main(String[] args) {
		try
		{
			FileWriter mywriter=new FileWriter("example.txt");
			mywriter.write("Hello");
			mywriter.write("Welcome to thejava course of codesDope");
			mywriter.close();
			
		}
		catch (Exception e) {
			System.out.println(e);
		}

	}

}

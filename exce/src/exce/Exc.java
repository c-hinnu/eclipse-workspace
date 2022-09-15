package exce;

public class Exc {

	public static void main(String[] args) {
		try {
			int num[]=new int[4];
			num[0]=5;
			num[1]=4;
			num[2]=6;
			num[3]=9;
			System.out.println(num[5]);
			}
			  catch(ArrayIndexOutOfBoundsException e)
			{
		   System.out.println("Array index out of bound");
			}
	}


	}



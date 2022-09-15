package hello;

public class Sumarray {

	public static void main(String[] args) {
		int num[]=new int[4];
		num[0]=5;
		num[1]=4;
		num[2]=6;
		num[3]=9;
		int sum=0;
		int product=1;
		int i;
		for(i=0;i<4;i++) {
			sum=num[i]+sum;
			product=num[i]*product;
			
		}
      System.out.println("sum is"+sum);
      System.out.println("product is"+product);
      
	}

}

package Sorting;

public class Insertion {

	public static void main(String[] args) {
		int[] data= {9,5,1,4,3};
		int size=data.length;
		for(int s=1;s<size;s++)
		{
			int item=data[s];
			int j=s-1;
			while(j >= 0 && item < data[j]) {
				data[j + 1] = data[j];
				--j;
			}
			data[j + 1] = item;
			
		    }
		for(int i=0;i<size;i++)
		{
			System.out.println(data[i]);
		}

	}

}

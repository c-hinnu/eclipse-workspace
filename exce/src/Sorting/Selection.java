package Sorting;

public class Selection {

	public static void main(String[] args) {
		int [] a= {36,19,29,12,5};
		int temp,i,j;
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

	
	for(i=0;i<a.length;i++)
	{
		System.out.println(a[i]+"");
	}

}}


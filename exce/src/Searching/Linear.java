package Searching;

public class Linear {

	public static void main(String[] args) {
		int [] a= {36,19,29,12,5};
		int i;
		int item=19;
		int flag=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				flag=1;
			   break;
			}
			
		}
      if(flag==1)
      {
    	  System.out.println("item found at position"+i);
      }
      else
      {
    	  System.out.println("not found");
      }
	}

}

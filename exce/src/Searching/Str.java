package Searching;

public class Str {

	public static void main(String[] args) {
	String [] a= {"anu","binu","cinu","dinu"};
		int i;
		String item="tinu";
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



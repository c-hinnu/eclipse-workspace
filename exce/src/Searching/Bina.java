package Searching;

public class Bina {

	public static void main(String[] args) {
		int [] r= {2,3,4,8,9,10};
		int li=0;
		int hi=r.length-1;
		int item=10;
		int mid=(li+hi)/2;
		while(li<=hi) {
			if(r[mid]==item)
			{
				System.out.println("item found at position"+mid);
				break;
			}
			else if(r[mid]<item)
			{
				li=mid+1;
			}
			else
			{
				hi=mid-1;
			}
			mid=(li+hi)/2;
		    }
		if(li>hi)
		{
			System.out.println("not found");
		
			
		}

	}

}

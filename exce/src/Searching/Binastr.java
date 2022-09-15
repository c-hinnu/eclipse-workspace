package Searching;

public class Binastr {

	public static void main(String[] args) {
		String [] r= {"apu","sachu","ammu","janu"};
		int li=0;
		int hi=r.length-1;
		String item="sachu";
		int mid=(li+hi)/2;
		while(li<=hi) {
			if(item.compareTo(r[mid])<0)
			{
			hi=mid-1;
			}
			else if(r[mid]==item)
			{
				System.out.println("element found at"+mid);
				break;
			}
			else
			{
				li=mid+1;
				mid=(li+hi)/2;
			}
			
		
		if(li>hi)
		{
			System.out.println("not found");
		
			
		}

	}

}


	}



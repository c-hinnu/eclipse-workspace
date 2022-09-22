package sep17;
interface Bank
{
	float rateOfInterest();
}
class Sbi implements Bank
{
	public float rateOfInterest()
	{
	return 9.15f;	
	}
}
class pnb implements Bank
{
	public float rateOfInterest()
	{
	return 9.7f;	
	}
}

public class Janm {

	public static void main(String[] args) {
		Bank b= new Sbi();
		System.out.println("ROI is"+" "+b.rateOfInterest());
		Bank r= new pnb();
		System.out.println("ROI is"+" "+r.rateOfInterest());
		
		

	}

}

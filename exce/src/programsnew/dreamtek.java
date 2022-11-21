package programsnew;

import java.util.Scanner;

class Associate
{
	
	public int getAssid() {
		return assid;
	}
	public void setAssid(int assid) {
		this.assid = assid;
	}
	public String getAssname() {
		return assname;
	}
	public void setAssname(String assname) {
		this.assname = assname;
	}
	public String getAsswrksts() {
		return asswrksts;
	}
	public void setAsswrksts(String asswrksts) {
		this.asswrksts = asswrksts;
	}
	
	public Associate(int assid, String assname) {
		super();
		this.assid = assid;
		this.assname = assname;
		
	}
	private int assid;
	private String assname;
	private String asswrksts;
	public void trackassociatestatus(int days)
	{
	if(days>60)
	{
	this.setAsswrksts("Deployed in project");
	}
	else
	{
		this.setAsswrksts("Not Deployed in project");
	}
	
	}
	
}

public class dreamtek {

	public static void main(String[] args) {
		
		 
		 Scanner sc =new Scanner(System.in);
		 System.out.println("enter associate id");
		 int id=sc.nextInt();
		 System.out.println("enter associate name");
		 String name=sc.next();
		 Associate a=new Associate(id,name);
		 System.out.println("enter number of days");
		 int d=sc.nextInt();
		 a.trackassociatestatus(d);
		 System.out.println("The associate "+name+" work status: "+a.getAsswrksts());
		 
		 
		 

	}

}

package programsnew;
abstract interface loan
{
	abstract double issueloan();
}
abstract interface Insurance
{
	abstract double takeinsurance();
}
class vehicle implements loan,Insurance
{
	public String getVno() {
		return vno;
	}
	public void setVno(String vno) {
		this.vno = vno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getVtype() {
		return vtype;
	}
	public void setVtype(String vtype) {
		this.vtype = vtype;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public vehicle(String vno, String mname, String vtype, double price) {
		super();
		this.vno = vno;
		this.mname = mname;
		this.vtype = vtype;
		this.price = price;
	}
	private String vno;
	private String mname;
	private String vtype;
	private double price;
	
	public double issueloan()
	{
		if(vtype=="4 wheeler")
		{
		return((80*price)/100);
		}
		else if(vtype=="3 wheeler")
		{
			return((75*price)/100);
		}
		else 
		{
			return((50*price)/100);
		}
	}
	public double takeinsurance()
	
	{
		if(price<=150000)
		{
			return 3500;
		}
		else if(price<150000 && price>=300000)
		{
			return 4000;
		}
		else
		{
			return 5000;
		}
		
	}
	
}



public class Vehinsurance {
	

	public static void main(String[] args) {
	vehicle v=new vehicle("45555","car","4 wheeler",1000);
	System.out.println("loan amount"+" "+v.issueloan());
	System.out.println("insurance amount"+" "+v.takeinsurance());
	vehicle v1=new vehicle("5555","auto","4 wheeler",120000);
	System.out.println("loan amount"+" "+v1.issueloan());
	System.out.println("insurance amount"+" "+v1.takeinsurance());
	vehicle v2=new vehicle("45111","car","4 wheeler",140000);
	System.out.println("loan amount"+" "+v2.issueloan());
	System.out.println("insurance amount"+" "+v2.takeinsurance());

	}

}

package moc;
import java.util.*;
abstract class Emp1
{

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Emp1(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
	}
	protected int empid;
	protected String empname;
	protected double salary;
	public abstract void calculatesalary();
}
	
	 class Peremp extends Emp1
	{
		public Peremp(int empid, String empname,double basicpay) {
			super(empid, empname);
			this.basicpay=basicpay;
		}

		private double basicpay;

		public double getBasicpay() {
			return basicpay;
		}

		public void setBasicpay(double basicpay) {
			this.basicpay = basicpay;
		}
		public void calculatesalary()
		{
			 salary=basicpay-(basicpay*0.12);
		}
	}
class tempemp extends Emp1
	{
		
		public tempemp(int empid, String empname,int hoursworked,int hourlywages) {
		super(empid, empname);
		this.hourlywages=hourlywages;
		this.hoursworked=hoursworked;
		// TODO Auto-generated constructor stub
	}
		public int getHoursworked() {
			return hoursworked;
		}
		public void setHoursworked(int hoursworked) {
			this.hoursworked = hoursworked;
		}
		public int getHourlywages() {
			return hourlywages;
		}
		public void setHourlywages(int hourlywages) {
			this.hourlywages = hourlywages;
		}
		private int hoursworked;
		private int hourlywages;
		public void calculatesalary()
		{
			salary=hoursworked*hourlywages;
		}
		
	}
class loan
{
	double loan=0.0;
	public double calculateloanamount(Emp1 empobj)
	{
		if(empobj instanceof tempemp)
		{
			loan=empobj.getSalary()*.15;
		}
		else if(empobj instanceof Peremp)
		{
			loan=empobj.getSalary()*.1;			
		}
		return loan;
	}
	
}

public class Employee {

	public static void main(String[] args) {

	Peremp p=new Peremp(101,"chinnu",40000);
	p.calculatesalary();
	System.out.println(p.getEmpid()+" "+p.getEmpname()+" "+p.getSalary());
	loan l=new loan();
	double m=l.calculateloanamount(p);
	System.out.println("loan amount for"+p.getEmpname()+"="+m);
	tempemp t=new tempemp(201,"chinnu",18,1000);
	t.calculatesalary();
	System.out.println(t.getEmpid()+" "+t.getEmpname()+" "+t.getHoursworked()+" "+t.getHourlywages());
	System.out.println(t.getSalary());
	double m2=l.calculateloanamount(t);
	System.out.println("loan amount for"+t.getEmpname()+" "+m2);
	

	}

}

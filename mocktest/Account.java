package mocktest;
class Customer
{
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	private int customerid;
    public Customer(int customerid, String customerName, String emailid) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.emailid = emailid;
	}
	private String customerName;
	private String emailid;
	
}
abstract class Account1
{
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account1(int accno, Customer c, double balance) {
		super();
		this.accno = accno;
		this.c = c;
		this.balance = balance;
	}
	protected int accno;
	protected Customer c;
	protected double balance;
	public abstract boolean withdraw(double amount);
	
}
class Savingsaccount extends Account1
{
	public Savingsaccount(int accno, Customer c, double balance,double minbalance) {
		super(accno, c, balance);
		// TODO Auto-generated constructor stub
	}

	private double minbalance;

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}

	@Override
	public boolean withdraw(double amount) {
		 if ( balance > minbalance)  {
	            return true;}
	        else {
	            return false;
	        }
	        }
	    
	
	}
	


public class Account {

	public static void main(String[] args) {
		

	}

}

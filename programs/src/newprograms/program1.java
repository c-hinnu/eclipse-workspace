package newprograms;

import java.util.Scanner;

class User1
{
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public String getUsername1() {
		return username1;
	}
	public void setUsername1(String username1) {
		this.username1 = username1;
	}
	public String getPassword1() {
		return password1;
	}
	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long mobno) {
		this.mobno = mobno;
	}
	
	public User1(String name1, String username1, String password1, long mobno) {
		super();
		this.name1 = name1;
		this.username1 = username1;
		this.password1 = password1;
		this.mobno = mobno;
	}
	private String name1;
	private String username1;
	private String password1;
	private long mobno;
	
	
}
class UserBo1
{
	static int a=0;
	public User1[]add(String name1,long mobno,String username1,String password1,User1[]users)
	{

		  
        users[a]=new User1(name1,username1,password1,mobno);
        a++;
        return users;
	}
	
	 public void display (User1 [] users)
	{
		   System.out.printf(" %20s %10s %10S  %10s",  "NAME", "MOBILE NUMBER","USERNAME", "PASSWORD");
	        for(int i=0;i<users.length;i++)
	        {
	            System.out.println();
	            System.out.printf( "%20s %10d %10S %10s", users[i].getName1(),users[i].getMobno(),users[i].getUsername1(), users[i].getPassword1());
	            
	        }
	        System.out.println();
	    }
	
	 public User1[] remove (String username , User1[] users) {
	        
	        int l=users.length;
	        User1  un[]=new User1[l-1];
	        for(int i=0,k=0;i<users.length;i++) {
	            if(!(users[i].getUsername1().equals(username)))
	            {
	                un[k++]=users[i];
	            }
	            
	        }
	        return un;
	    }
	    
}
public class program1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number to be added");
		int n=sc.nextInt();
		 User1  u[]=new User1[n];
	     UserBo1 o=new UserBo1();
		
		for(int i=0;i<n;i++)
		{
		System.out.println("enter the userdetails"+i+1);
	    System.out.println("enter the name");
		String s1=sc.next();
		  System.out.println("enter mobile number");
			long m1=sc.nextInt();
	    System.out.println("enter username");
		String u1=sc.next();
        System.out.println("enter password");
        String p1=sc.next();
      
		o.add(s1,m1,u1,p1,u);
		

	}
		System.out.println("Users created succcsessfully");
        while(true) 
        {
        
            System.out.println("Menu:");
            System.out.println("1.Display all users");
            System.out.println("2.Remove a user");
            System.out.println("3.Exit");
            int c=sc.nextInt();
            
            switch(c) 
            {
            
            case 1 : o.display(u);
                     break;
            case 2:
                System.out.println("Enter the username");
                String ru=sc.next();
                u=o.remove(ru, u);
                o.display(u);
                break;
            
            case 3:System.exit(0);
            default:System.out.println("Enter valid choice:");break;
            }
        }
        
            
        
    }



}




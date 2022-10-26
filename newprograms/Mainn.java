package newprograms;
import java.util.*;
class User
{
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsernmae() {
		return usernmae;
	}
	public void setUsernmae(String usernmae) {
		this.usernmae = usernmae;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public User(int id, String usernmae, String password) {
		super();
		this.id = id;
		this.usernmae = usernmae;
		this.password = password;
	}
	
	private int id;
	private String usernmae;
	private String password;
    }
class UserBo
{
	public User[] getUsers()
	{
	  User[] Users=new User[]{new User(1, "Louis", "rxfsuzA2345"),new User(2, "Messie", "hppphmf1"),new User(3, "Steve", "opefKt")};
	        return (Users);
	}
public String encryptPassword(String password)
{
    String bar="";
    for (char c : password.toCharArray()) 
    {
           bar += Character.toString((char)(c+1));
        }
    return(bar);
}

	

boolean validate(String username,String password)
{
	User []a=getUsers();
    
    for(int i=0;i<a.length;i++)
    {
        
        if(username.compareTo(a[i].getUsernmae().toString())==0 && encryptPassword( password).compareTo(a[i].getPassword().toString())==0)
        {
            

            return true;
        }
        
    }
    return false;
    
}
}



public class Mainn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        UserBo u1=new UserBo();
 System.out.println("enter username");
String user=sc.next();
System.out.println("enter password");
String password=sc.next();
User u=new User(1,user, password);
u1.encryptPassword(password);

 

if(u1.validate(user, password)==true)
{
    System.out.println("login sucessful");
}else
    System.out.println("login unsucessful");
    }

 


		

	}



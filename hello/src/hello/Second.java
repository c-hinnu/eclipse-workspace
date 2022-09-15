package hello;


class Member{
	String name,addr;
	int age,salary;
	String phone;
	public void show()
	{
		System.out.println(name);
		System.out.println(addr);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(salary);
		
	}
	
	public void printSalary()
	{
		
	}
}
class Employee extends Member
{
	char specialization;
}
class Manager extends Member
{
	char department;
}

public class Second {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		Manager m=new Manager();
		e.name="chinnu";
		e.addr="pettikattil";
		e.age=25;
		e.phone="44566767778";
		e.salary=140000;
		e.show();
		m.name="chippy";
		m.addr="pettikattil";
		m.age=25;
		m.phone="44566767778";
		m.salary=140000;
		m.show();
		
		

	}

}

package mthds;
class Member
{
	String name;
	int age;
	long phoneno;
	String address;
	int salary;
	public void printDetails()
	{
		System.out.println("name=" +name);
		System.out.println("age=" +age);
		System.out.println("phoneno=" +phoneno );
		System.out.println("address=" +address);
		System.out.println("salary=" +salary);
	}
}
class Employee extends Member
{
  String specilization;
}
class Manager extends Member
{
	String department;
}


public class Inheritanceprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.name="athira";
		emp1.age=30;
		emp1.phoneno=904812599;
		emp1.address="abcdef";
		emp1.salary=15000;
		System.out.println(emp1.specilization="testor" );
		emp1.printDetails();
		Manager m=new Manager();
		m.name="mehgana";
		m.age=30;
		m.phoneno=904812565;
		m.address="kanayamplackal";
		m.salary=25000;
		System.out.println(m.department="HR" );
		m.printDetails();
		
		
		
		

	}

}

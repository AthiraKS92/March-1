package mthds;
 class Member1
 {
	 String name;
	 int age;
	 long phno;
	 String address;
	 int salary;
	 public void printdetails()
	 {
		 System.out.println("name is" +name);
		 System.out.println("age is" +age);
		 System.out.println("phone no is" +phno);
		 System.out.println("Address is" +address);
		 System.out.println("Salary is " +salary);
	 }
 }
 class Employeee extends Member1
 {
	 String specialisation;
	 
 }
 class Managerr extends Member1
 {
	 String department;
 }
public class Inheritancesampleprgm {

	public static void main(String[] args) {
		
		Employeee emp=new Employeee();
		emp.name="Athira K S";
		emp.age=30;
		emp.phno=9048125997l;
		emp.address="kanayamplackal house";
		emp.salary=25000;
		emp.specialisation="Testing engineer";
		emp.printdetails();
		Managerr mn=new Managerr();
		mn.name="Hrishikesh Arun";
		mn.age=20;
		mn.phno=9048505757l;
		mn.address="Aswathy house";
		mn.salary=50000;
		mn.department="IT";
		mn.printdetails();
		
				
		
		
		
		
	}

}

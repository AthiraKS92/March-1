package mthds;

public class Student {
	
	int studentid;
	String studentname;
	String collegename="uce";
	
	public Student(int studentid,String studentname)
	{
		this.studentid=studentid;
		this.studentname=studentname;
	}
	
	public void display()
	{
		System.out.println("studentid =" +studentid );
		System.out.println("studentname =" +studentname);
	}

	public static void main(String[] args) {
		// constructor
		Student s=new Student(101,"athira");
		
		s.display();
	
	}

}

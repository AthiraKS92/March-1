package mthds;

class emp
{
	private String empname;
	private String empdesignation;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpdesignation() {
		return empdesignation;
	}
	public void setEmpdesignation(String empdesignation) {
		this.empdesignation = empdesignation;
	}
}





public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
emp ob=new emp();
ob.setEmpdesignation("developer");
ob.setEmpname("arun");
System.out.println(ob.getEmpname());
System.out.println(ob.getEmpdesignation());
	}

}

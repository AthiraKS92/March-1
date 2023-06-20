package mthds;

public class Methodoverlapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverlapping ob=new Methodoverlapping();
		ob.add();
		ob.add(20,30);
		ob.add(20.4,30);
		ob.add(30.4,30);
	}
	public void add()
	{
		int a=20,b=30,c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
		
	}
	public void add(int a,double b)
	{
		double c;
		c=a+b;
		System.out.println(c);
		
	}
	
	public void add(double a,int b)
	{
		double c;
		c=a+b;
		System.out.println(c);
		
	}
	
}

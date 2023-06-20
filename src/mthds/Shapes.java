package mthds;

public class Shapes {

	public static void main(String[] args) {
	Shapes ob=new Shapes();
	ob.area();
	double rect=ob.rect();
	System.out.println("area rectangle is " +rect);
	double circle=ob.cle(5);
	System.out.println("circle area"  +circle);
	ob.squ(6);

	}
	
	public void area()
	{
		double b=12,h=15;
		double a=0.5*b*h;
		System.out.println(a);
	}
	
	public double rect()
	{
		double l=10,b=12;
		double a=l*b;
		return a;
	}
	
	public double cle(double r)
	{
		double a=3.14*r*r;
		return a;
		
	}
	public void squ(double r)
	{
		double a=r*r;
		System.out.println("area of square " +a);
				
				
	}		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}



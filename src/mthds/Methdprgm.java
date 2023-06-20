package mthds;

public class Methdprgm {

	public static void main(String[] args) {
		
		Methdprgm ob=new Methdprgm();
		ob.add();
		int subt=ob.sub();
		System.out.println("Substaction = " +subt);
		int mlti=ob.mul(20, 10);
		System.out.println("multiplication"  +mlti);
		ob.div(6.78, 5.6);

	}
	//without returntype & without parameters 
	
	 public void add()
	 {
		 int a=20,b=40;
		 int c=a+b;
		 System.out.println(c);
	 }
	 
	 //with returntype and without parameters
	 
	 public int sub ()
	 {
		 int a=40,b=90;
		 int c=a-b;
		 return c;
	 }
	 
	 //with returntype and with parameters
	 
	 public int mul(int a ,int b)
	 {
		 
		 int c=a*b;
		 return c;
	 }
   
	 //without returntype and with parametrs
	  public void div(double a,double b)
	  {
		  double c=a/b;
		  System.out.println(c);
	  }
}

package controlstmnts;


interface Bank
{
	public void deposit();
	public void withdraw();
	public void balance();
}

class SBI implements Bank
{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("sbi deposit");
		
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.print("sbi  withdraw");
	}

	@Override
	public void balance() {
		// TODO Auto-generated method stub
		System.out.print("sbi  balance");
	}
	
}

class Federal implements Bank

{


@Override
public void deposit() 
{
     System.out.println("federal deposit");
	
}

@Override
public void withdraw()
{
	// TODO Auto-generated method stub
	   System.out.println("federal withdraw");
		
	
}

@Override
public void balance() 
{
	  System.out.println("federal balance");
	
	
}
}
public class Interfacepgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank ob=new SBI();
		ob.deposit();
		ob.withdraw();
		ob.balance();
		
		ob=new Federal();
		ob.deposit();
		ob.withdraw();
		ob.balance();
	}
}


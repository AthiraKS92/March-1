package mthds;

class Car
{
	public void accelator()
	{
		System.out.println("accelarating");
	}
}
class BMW extends Car
{

	@Override
	public void accelator() {
	 System.out.println("BMW accelarating");
		super.accelator();
	}
	
}



public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   BMW ob=new BMW();
   ob.accelator();
	}

}

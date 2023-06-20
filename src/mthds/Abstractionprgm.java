package mthds;

abstract class Ccar
{
	abstract public void speedlimit();
	public void carengine()
	{
		System.out.println("Car engine");
	}
}
 class Maruthi extends Ccar
 {

	@Override
	public void speedlimit() {
		// TODO Auto-generated method stub
		System.out.println("Maruthi Sppedd limit 100");
	}
	 
 }



public class Abstractionprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Maruthi m=new Maruthi();
     m.carengine();
     m.speedlimit();
	}

}

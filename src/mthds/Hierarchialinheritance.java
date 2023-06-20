package mthds;
class Animal1
	{
		public void animaldetails()
		{
			System.out.println("animal details");
		
		}
	}
	class Dog1 extends Animal1
	{
		public void dogdetails()
		{
			System.out.println("dog");
		}
		
	}
	class Tiger extends Animal1
	{
		public void tigerdetails()
		{
			System.out.println("tiger details");
		}
	}
	
	public class Hierarchialinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog1 ob=new Dog1();
		ob.animaldetails();
		ob.dogdetails();
		Tiger t=new Tiger();
		t.animaldetails();
		t.tigerdetails();

	}

}

package mthds;

class Animal
{
	public void animalfood()
	{
		System.out.println("animal food");
	}
}


class Dog extends Animal
{
	public void breed()
	{
		System.out.println("lab");
	}
}
 

public class Singlelevelinheritanc {

	public static void main(String[] args) {
		
		Dog ob=new Dog();
		ob.animalfood();
		ob.breed();
		
		
		

	}

}

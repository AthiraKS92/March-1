package mthds;

class Aanimal
{
	public void animalfood()
	{
		System.out.println("animal food");
	}
}
class Ddog extends Aanimal

{
	public void breed()
	{
		System.out.println("dog breed lab");
	}
}

class Babydog extends Ddog
{
	public void baby()
	{
		System.out.println("baby dog small");
	}
}


public class Multilevelinheritance {

	public static void main(String[] args) {
	
	Ddog dg=new Ddog();
	dg.animalfood();
	dg.breed();
	Babydog bg=new Babydog();
	bg.animalfood();
	bg.baby();
	bg.breed();
		
	}

}

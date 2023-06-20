package mthds;


interface Basicanimal
{
	public void eat();
	public void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("jumpimg");
	}
	public void bite()
	{
		System.out.println("biting");
	}
}
class Human extends Monkey implements Basicanimal
{
	public void speak()
	{
		System.out.println("speaking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
	}
}



public class Interfaceprgm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Human ob=new Human();
 ob.speak();
 ob.eat();
 ob.bite();
 ob.sleep();
 ob.jump();
 
	}

}

package newpkge;

import java.util.Scanner;

public class Namescannerprgm {
	//String--next()

	public static void main(String[] args) {
		
		System.out.println("enter your name");
		Scanner sc=new Scanner (System.in);
		String a=sc.nextLine();
		char c=sc.next().charAt(2);
		
		System.out.println("enterd name is " +a);
		System.out.println("4th position is "  +c);
		
		

	}

}

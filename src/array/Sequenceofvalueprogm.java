package array;

import java.util.Scanner;

public class Sequenceofvalueprogm {

	public static void main(String[] args) {
		System.out.println("enter text");
		Scanner sc=new Scanner (System.in);
		String s=sc.nextLine();
		System.out.println("entered text is: " +s);
		
		if(s.contains("language"))
		{
		System.out.println("text is present");
		}
		else 
		{
			System.out.println("text is not present");
		}
		
		
	}

}

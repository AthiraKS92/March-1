package controlstmnts;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
	
		int digit,rev=0,temp;
		System.out.println("eter a no");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			digit=n%10;
			rev=rev*10 + digit;
			n=n/10;
			
		}
		 System.out.println("reversed no is " + rev);
		 
		 if(temp==rev)
		 {
			 System.out.println("no is pallindrome");
			 
		 }
		 else
			 System.out.println("not pallidrome");
		
		

	}

}

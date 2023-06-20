package mthds;

import java.util.Scanner;

public class Suminteger {

	public static void main(String[] args) {
		
		System.out.println("enter number");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		 Suminteger si= new Suminteger();
		 si.sumofinteger(n);
	 
	}	
	public void sumofinteger(int n)
	{ 
		int sum=0,digit;
		while(n>0)
		{
			digit=n%10;
			sum=sum+digit;
			n=n/10;
			
		}
		System.out.println("Sum of integers is " +sum);
		

	}
}

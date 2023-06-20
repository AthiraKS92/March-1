package mthds;

import java.util.Scanner;

public class Sumofintegers {

	public static void main(String[] args) {
		System.out.print("enter a number");
	     Scanner sc=new Scanner (System.in);
	    	int	n=sc.nextInt();
	    	Sumofintegers s=new Sumofintegers();
	    	int sum=s.sumofinteger(n);
	    	System.out.println("sum of integers"  +sum);
	    

	}
	
	public int sumofinteger(int n)
	{
		int r,s=0;
		while (n>0)
		{
			r=n%10;
		    s=s+r;
		    n=n/10;
		}
		
		 return s; 
	}
	

}

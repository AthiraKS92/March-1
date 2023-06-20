package basicprgm;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
	System.out.println("enter a number");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int n=num,r,csum=0;
	while(num>0)
	{
		r=num%10;
		csum=csum+(r*r*r);
		num=num/10;
	}
		
	if(n==csum)
	{
		System.out.println("no: is armstrong" );
	}
	else
	{
		System.out.println("no: is not armstrong " );
		
	}

	}

}

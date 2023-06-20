package mthds;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		System.out.print("enter 3 numbers");
	     Scanner sc1=new Scanner (System.in);
	    	int	n1=sc1.nextInt();
	    	int	n2=sc1.nextInt();
	    	int	n3=sc1.nextInt();
	    	 Average a=new Average();
	    	//a.avg(n1,n2,n3);
	    	// int aavg=a.avg(n1, n2, n3);
	    	 System.out.println("avergae"   +a.avg(n1, n2, n3));
	}

	
	public int avg(int n1,int n2,int n3)
	{
		int s=n1+n2+n3;
		int result=s/3;
		//System.out.println(result);
	    return	result;
	}
	
}

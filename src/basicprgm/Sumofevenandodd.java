package basicprgm;

import java.util.Scanner;

public class Sumofevenandodd {
  public static void main(String[] args) {
		int even=0,odd=0,digit;
    System.out.println("enter the integers ");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	while(num>0)
	{
		digit=num%10;
	if (digit%2==0)
	{
		even=even+digit;
	}
	else
	{
		odd=odd+digit;
	}
	num=num/10;
	}
	System.out.println("sum of even" +even);
	System.out.println("sum of odd" +odd);
	
	}
	}



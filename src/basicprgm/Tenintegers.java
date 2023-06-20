package basicprgm;

import java.util.Scanner;

public class Tenintegers {

	public static void main(String[] args) {
		System.out.println("enter the integers");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		float sum=0,digit;
		float avg;
		for(int i=0;i<=10;i++)
		{
        digit=num%10;
        num=num/10;
        sum=sum+digit;
		}
		avg=sum/10;
		System.out.println( "sum is" + sum + " and avg is"  + avg );
		}

}

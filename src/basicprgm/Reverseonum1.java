package basicprgm;

import java.util.Scanner;

public class Reverseonum1 {

	public static void main(String[] args) {
		System.out.println("enter no");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0,digit;
		for(int i=1;i<=10;i++)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
		
	}

}

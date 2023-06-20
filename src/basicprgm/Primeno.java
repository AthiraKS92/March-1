package basicprgm;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		System.out.println("enter a no:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int flag;
		for(int i=2;i<num;i++)
		{
		if(num % i==0)
		{
			 flag = 0;
             break;
         }
         else
         {
             flag = 1;
         }
      if(flag==1)
      {
    	  
			System.out.println("not prime no:");
		}
		else
		{
			System.out.println(" a prime no: ");
		}
		}
		

	}

}

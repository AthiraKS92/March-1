package basicprgm;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		System.out.println("enter number");
		Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int sum=0,n;
        while(m>0)
        {
        	  n = m % 10;
              sum = sum + n;
              m = m / 10;
    	}
        	System.out.println("sum of digits" +sum);
      



	}
}

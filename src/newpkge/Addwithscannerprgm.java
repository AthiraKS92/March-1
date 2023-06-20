package newpkge;

import java.util.Scanner;

public class Addwithscannerprgm {
	//int--nextint()

	public static void main(String[] args) {
		
		System.out.println("enter a number" );
		
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("enter second number");
        
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("sum is" +sum);
	}

}

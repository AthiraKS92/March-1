package array;

import java.util.Scanner;

public class Singlearray {

	public static void main(String[] args) {
		int[] a=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nos:");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		 System.out.println("entered no are");
		for(int i=0;i<3;i++)
		{
		 System.out.println(a[i]);	
		}

	}

}

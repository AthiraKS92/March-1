package array;

import java.util.Scanner;

public class Multidimensionl {

	public static void main(String[] args) {
		System.out.println("enter nos:");
		Scanner sc=new Scanner (System.in);
		int ar[][]=new int [3][2];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.nextInt();
			
			}
		}
       System.out.println("entered nos:");
       for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j] +"   ");
			
			}
			System.out.println();
		}
	}
}



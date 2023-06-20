package basicprgm;

import java.util.Scanner;

public class Multiarrayprgm {

	public static void main(String[] args) {
		System.out.println("enter nos:");
		Scanner sc=new Scanner (System.in);
		int ar[][]=new int[4][5];
		for(int i=0;i<4;i++)
		{
		  for(int j=0;j<5;j++)
		  {
			  ar[i][j]=sc.nextInt();
		  }
		}
		System.out.println("entered nos are");
	
		for(int i=0;i<4;i++)
		{
		  for(int j=0;j<5;j++)
		  {
			  System.out.print(ar[i][j]+" ");
		  }
		  System.out.println();
		}
		
		
	}

}

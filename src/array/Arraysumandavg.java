package array;

import java.util.Scanner;

public class Arraysumandavg {

	public static void main(String[] args) {
	int[] a=new int[5];
	int sum=0;
	double avg;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter nos:");
	for(int i=0;i<5;i++)
	{
     a[i]=sc.nextInt();
	
	sum=sum+a[i];

	}
	System.out.println("sum" +sum);
	avg=sum/5;
	System.out.println("average" +avg);
	}

}

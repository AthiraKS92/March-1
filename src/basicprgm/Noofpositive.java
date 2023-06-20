package basicprgm;

import java.util.Scanner;

public class Noofpositive {

	public static void main(String[] args) {
		int cp=0,cn=0,cz=0;
     System.out.println("enter 10 numbers");
     Scanner sc=new Scanner(System.in);
      for(int i=1;i<=10;i++)
      {
    	  int n=sc.nextInt();
    	  if(n>0)
    	  {
    		  cp++;
    	  }
    	  else if(n<0)
    	  {
    	      cn++;
    	  }
    	  else
    	  {
    		  cz++;  
    	  }
      }
      System.out.println("no of positive no:"  +cp);
      System.out.println("no of negative no:"  +cn);
      System.out.println("no of zeros no:"  +cz);
      
      
      }
      
	}


	



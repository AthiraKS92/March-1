package mthds;

public class Exceptionprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try
      {
    	  int a=20,b=0;
    	  int c=a/b;
    	  System.out.println(c);
      }
		catch(Exception e)
      {
			System.out.println(e.getMessage());
			System.out.println("Arithematic exception");
      }
		
		System.out.println("hello athira ");
		
		
		
		try
		{
			int a[]=new int [2];
			a[0]=34;
			a[1]=6;
			System.out.println(a[3]);
		}
		 catch(Exception t)
		{
			 System.out.println("Array is out of bound");
		}
		
		
		
		try
		{
			String a =null;
			System.out.println(a.length());
			
		}
		catch(Exception t)
		{
			System.out.println(t.getMessage());
		}
		
		
		
		
	}

}

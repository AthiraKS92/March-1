package controlstmnts;

public class Rversenumber {

	public static void main(String[] args) {
	
		int n=345987,rev=0,digit;
		while(n>0)
		{
			digit=n%10;
			rev=rev*10 + digit;
			n=n/10;
			
		}
     System.out.println("reversed no is " + rev);
	}

}

package controlstmnts;

public class Countwhilenum {

	public static void main(String[] args) {
		int n=3456,count=0;
		while(n>0)
		{
			n=n/10;
			count++;
			
		}
		
		System.out.println("no of digits is " +count);

	}

}

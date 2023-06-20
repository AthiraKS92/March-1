package pkge;

public class Stringpallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s="abba";
        String rev="";
        
        for(int i=s.length()-1;i>=0;i--)  //index value 0
        {
        	rev=rev+s.charAt(i);
        	System.out.println("reverse " +rev);
        if(s.equals(rev))
        {
        	System.out.println("String is a pallindrome");
        }
		
        else
        {
        	System.out.println("not a pallindrome");
        }
        }
	}

}

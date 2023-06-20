package array;

public class Stringopertionprogm {

	public static void main(String[] args) {
		
		// concatenation
		
		String s="hello";
		String s1="welcome";
        String s2="Hello how are you";
        
		
		System.out.println(s.concat(s1));
		System.out.println(s+s1);
		System.out.println(1+3+s+4+5);
		
		//.equals
		String s3="Hello";
		System.out.println(s.equals(s3));
		System.out.println(s.equalsIgnoreCase(s3));
		
		//contains
		
		System.out.println(s2.contains("are"));
		
		//toUpperCase & //toLowerCase
		

		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		//trim
		
		System.out.println(s2.trim());
		
		//length
		
		System.out.println(s2.length());
		
		// startsWith and endsWith
		
		System.out.println(s2.startsWith("Hello"));
		System.out.println(s2.endsWith("you"));
		
		//Substring
		
		System.out.println(s2.substring(2,7));
		
		//charAt()
		
		System.out.println(s.charAt(2));
		
		//split
		
		String[] sr=s2.split(" ");
		 for (String v:sr)
		 {
		System.out.println(v);
	}

	}
}

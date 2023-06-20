package pkge;

public class Operators {

	public static void main(String[] args) {
	
		int a=20,b=10;
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
		System.out.println("a%b="+(a%b));

		
		
		
		int c=30,d=40;
		System.out.println("c+=d"+(c+=d));
		System.out.println("c-=d"+(c-=d));
		System.out.println("c*=d"+(c*=d));
		System.out.println("c/=d"+(c/=d));
		
		
		System.out.println("a>b"+(a>b));
		System.out.println("a<b"+(a<b));
		System.out.println("a>=b"+(a>=b));
		System.out.println("a<=b"+(a<=b));
		System.out.println("a!="+(a!=b));
		System.out.println("a=="+(a==b));
		
		String usrnme="abc";
		String pswd="123";
		System.out.println(usrnme=="abc" && pswd=="123");
		System.out.println(usrnme=="abc" || pswd=="1234");
		System.out.println(!(usrnme=="abc"));
		
		
		int t=10;
		System.out.println(t++);
		System.out.println(++t);
		System.out.println(t--);
		System.out.println(--t);
	}

}

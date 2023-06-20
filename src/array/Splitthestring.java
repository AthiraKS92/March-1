package array;

public class Splitthestring {

	public static void main(String[] args) {
		String s3="selenium weddriver is used for webapplication testing";
		String[]sr=s3.split(" ");
		for(String v:sr)
		{
		
			System.out.println(v);
			if(v.contains("webapplication"))
			{
				break;
			}
		}
			
	}
}

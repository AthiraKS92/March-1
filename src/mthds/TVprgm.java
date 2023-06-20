package mthds;

interface Tvremote
{

	public void volumeup();
	public void volumedown();
	
}

interface Smarttvremote extends Tvremote
{
	public void voicesearch();
	public void arrowpoint(); 
}


class TV implements Smarttvremote
{

	@Override
	public void volumeup() {
		System.out.println("volume up in tv remote");
		
	}

	@Override
	public void volumedown() {
		// TODO Auto-generated method stub
		System.out.println("volume down in tv remote");
		
	}

	@Override
	public void voicesearch() {
		System.out.println("voice search in smarttv remote");
		
	}

	@Override
	public void arrowpoint() {
		// TODO Auto-generated method stub
		System.out.println("arrowpoint in smarttv remote");
		
	}
}

public class TVprgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Smarttvremote ob=new TV();
     ob.volumeup();
     ob.volumedown();
     ob.arrowpoint();
     ob.voicesearch();
     
	}

}

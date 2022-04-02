package week3.day1;

public class SmartPhone extends AndroidPhone{
	
	public void takeVideo() {
		System.out.println("Take Video2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println("Mobile Methods are:");
		Mobile mob = new Mobile ();
		mob.sendMsg();
		mob.makeCall();
		mob.saveContacts();
		
		System.out.println("Android Phone Methods are:");
		AndroidPhone ar = new AndroidPhone ();
		ar.takeVideo();
		ar.connectingToWhatsapp();
		
		System.out.println("Smart Phone Methods are:");
		SmartPhone smart = new SmartPhone ();
		smart.takeVideo();
				
	}

}

package org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		System.out.println("Desktop Size");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Methods   :desktopSize()
//create above 2 class and call all your class methods into the 
//Desktop using single inheritance.
		
		Desktop desk = new Desktop();
		desk.desktopSize();
		
		Computer com = new Computer();
		com.computerModel();
	}

}

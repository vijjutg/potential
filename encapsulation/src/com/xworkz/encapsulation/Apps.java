package com.xworkz.encapsulation;

public class Apps {

	Mobile phone = new Mobile();

	boolean touch = phone.screenTouch;

	int storage = phone.totalStorage;

	int appsNo = phone.noOfApps;

	String usedApp = phone.mostUsedApp;

	double storageOfApps = phone.appStorage;

	public void display() {
		System.out.println(touch);
		System.out.println(storage);
		System.out.println(appsNo);
		System.out.println(usedApp);
		System.out.println(storageOfApps);
	}

}

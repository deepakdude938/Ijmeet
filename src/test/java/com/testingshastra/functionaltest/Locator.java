package com.testingshastra.functionaltest;

import utility.FileUtility;

public class Locator {
	public String logoImage;
	public String joinMeeting;
	public String hostMeeting;
	public String contactSales;
	public String signIn;
	public String signUp;

	public Locator(String logoImage, String joinMeeting, String hostMeeting, String contactSales, String signIn,
			String signUp) {
		super();
		this.logoImage = FileUtility.getproperty(logoImage);
		this.joinMeeting = FileUtility.getproperty(joinMeeting);
		this.hostMeeting = FileUtility.getproperty(hostMeeting);
		this.contactSales = FileUtility.getproperty(contactSales);
		this.signIn = FileUtility.getproperty(signIn);
		this.signUp = FileUtility.getproperty(signUp);
	}

	public  String getLocator() {
		Locator loco=new Locator(FileUtility.getproperty(logoImage),FileUtility.getproperty(joinMeeting),FileUtility.getproperty(hostMeeting),FileUtility.getproperty(contactSales),FileUtility.getproperty(signIn),FileUtility.getproperty(signUp));
		return contactSales;
	}

}

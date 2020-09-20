package com.pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

/**
 * 6-9
 * @author abc
 *
 */

public class HomePage

{
	@FindBy(xpath="//img[@src='https://ijmeet.com/images/LOGO-F@2x.png']")
	public WebElement logo;
	
	@FindBy(xpath="//a[@href='https://ijmeet.com/app']")
	public WebElement joinMeeting;
	
	
	@FindBy(xpath="//a[@href='https://ijmeet.com/host_meeting']")
	public WebElement hostMeeting;
	
	
	@FindBy(xpath="//nav/div/div/ul/li/a[@href='https://ijmeet.com/contact']")
	public WebElement contactSales;
	
	
	@FindBy(xpath="//a[@href='https://ijmeet.com/login']")
	public WebElement signIn;
	
	
	@FindBy(xpath="//li/a[@href='https://ijmeet.com/register']")
	public WebElement signUp;
	
	
	public boolean isLogoVisible() {
		return logo.isDisplayed();
		
	}
	
	public void clickOnLogo() {
		logo.click();
	}
	

	public boolean isJoinMeetingVisible() {
		return joinMeeting.isDisplayed();
		
	}
	
	public void clickOnJoinMeeting() {
		joinMeeting.click();
	}

	public boolean isHostMeetingVisible() {
		return hostMeeting.isDisplayed();
		
	}
	
	public void clickOnHostMeeting() {
		hostMeeting.click();
	}

	public boolean isLogoContactSales() {
		return contactSales.isDisplayed();
		
	}
	
	public void clickOnContactSales() {
		contactSales.click();
	}

	public boolean isSignInButtonVisible() {
		return signIn.isDisplayed();
		
	}
	
	public void clickOnSignButton() {
		signIn.click();
	}

	public boolean isSignUPButtonVisible() {
		return signUp.isDisplayed();
		
	}
	
	public void clickOnSignUP() {
		signUp.click();
	}

}

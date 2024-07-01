package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddStaffMemberPage {
	WebDriver driver;
	public  AddStaffMemberPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
}
	@FindBy(id="fname")
	private WebElement FnameEdt;
	@FindBy(id="lname")
	private WebElement LnameEdt;
	@FindBy(xpath="//input[@placeholder='Address']")
	private WebElement addressEdt;
	@FindBy(xpath="//input[@placeholder='Contact Number']")
	private WebElement MobleNumberEdt;
	@FindBy(xpath="//input[@placeholder='Email Address']")
	private WebElement emailEdt;
	@FindBy(xpath="//select[@placeholder='Select your Gendere']")
	private WebElement genderDB;
	//input[@placeholder='Birthday']
	@FindBy(xpath="//input[@placeholder='Birthday']")
	private WebElement DOBwidget;
	@FindBy(xpath="//select[@placeholder='Select your Staff Type']")
	private WebElement staffDB;
	@FindBy(xpath="//select[@name='workt']")
	private WebElement worktDB;
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement addstaffSubmtBtn;
	@FindBy(xpath="//div[text()='Registration Successful !']")
	private WebElement sucessmessaheHeader;
	
	public WebElement getSucessmessaheHeader() {
		return sucessmessaheHeader;
	}
	public WebElement getFnameEdt() {
		return FnameEdt;
	}
	public WebElement getLnameEdt() {
		return LnameEdt;
	}
	public WebElement getAddressEdt() {
		return addressEdt;
	}
	public WebElement getMobleNumberEdt() {
		return MobleNumberEdt;
	}
	public WebElement getEmailEdt() {
		return emailEdt;
	}
	public WebElement getGenderDB() {
		return genderDB;
	}
	public WebElement getDOBwidget() {
		return DOBwidget;
	}
	public WebElement getStaffDB() {
		return staffDB;
	}
	public WebElement getWorktDB() {
		return worktDB;
	}
	public WebElement getAddstaffSubmtBtn() {
		return addstaffSubmtBtn;
	}
	
	
	
}	

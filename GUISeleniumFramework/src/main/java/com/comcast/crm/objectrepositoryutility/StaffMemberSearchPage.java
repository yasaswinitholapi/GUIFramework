package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffMemberSearchPage {
	WebDriver driver;
	public  StaffMemberSearchPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);	
	}
	@FindBy(xpath="//input[contains(@placeholder,'Enter Registration No /')]")
	private WebElement staffsearchEdt;
	@FindBy(xpath="//button[text()='Search']")
	private WebElement staffsearchBtn;
	//button[text()='Search']
	public WebElement getStaffsearchEdt() {
		return staffsearchEdt;
	}
	public WebElement getStaffsearchBtn() {
		return staffsearchBtn;
	}
	
	
}

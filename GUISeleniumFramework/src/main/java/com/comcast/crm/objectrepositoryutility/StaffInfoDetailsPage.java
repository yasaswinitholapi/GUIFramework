package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffInfoDetailsPage {
	WebDriver driver;
	 public StaffInfoDetailsPage(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	@FindBy(xpath="//strong[text()='Staff Memebers Details']")
		private WebElement StaffInfoDetailsBtn;
	public WebElement getStaffInfoDetailsBtn() {
		return StaffInfoDetailsBtn;
	} 
	 
}


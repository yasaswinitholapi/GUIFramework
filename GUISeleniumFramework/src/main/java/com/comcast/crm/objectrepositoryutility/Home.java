package com.comcast.crm.objectrepositoryutility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.comcast.crm.generic.webdriverutility.WebDriverUtility;

/**
 * 
 * @author Deepak
 * 
 * Contains Login page elements & business lib like login()
 *
 */  
public class Home extends WebDriverUtility{                             
                           
	WebDriver driver;
	 public Home(WebDriver driver) {            
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//strong[text()='Add Staff Memeber']")
	 private WebElement AddStaffMemberBtn;

	 public WebElement getAddStaffMemberBtn() {
		return AddStaffMemberBtn;
	}
	@FindBy(xpath="//a[text()='Logout']")
	 private WebElement LogoutBtn;
	 @FindBy(xpath="//a[text()='Patient Info']")
	 private WebElement PatientInfoBtn;
	 @FindBy(xpath="//a[text()='Staff Info']")
	 private WebElement staffInfoBtn;
	 @FindBy(xpath="//a[text()='Ptient Invoices']")
	 private WebElement PtientInvoicesBtn;
	 @FindBy(xpath="//a[text()='Room Information']")
	 private WebElement RoomInformationBtn;
	 @FindBy(xpath="//li//a[text()='Admited Patient Information']")
	 private WebElement AdmitedPatientInformationBtn;
	 
	public WebElement getLogoutBtn() {
		return LogoutBtn;
	}

	public WebElement getPatientInfoBtn() {
		return PatientInfoBtn;
	}

	public WebElement getStaffInfoBtn() {
		return staffInfoBtn;
	}

	public WebElement getPtientInvoicesBtn() {
		return PtientInvoicesBtn;
	}

	public WebElement getRoomInformationBtn() {
		return RoomInformationBtn;
	}

	public WebElement getAdmitedPatientInformationBtn() {
		return AdmitedPatientInformationBtn;
	}

	public void setStaffInfoBtn(WebElement staffInfoBtn) {
		this.staffInfoBtn = staffInfoBtn;
	}

	public void setAdmitedPatientInformationBtn(WebElement admitedPatientInformationBtn) {
		this.AdmitedPatientInformationBtn = admitedPatientInformationBtn;
	}

	public void logout() {
		LogoutBtn.click();
	}

	

	
	
}

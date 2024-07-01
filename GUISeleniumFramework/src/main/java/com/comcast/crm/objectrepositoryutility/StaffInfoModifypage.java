package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaffInfoModifypage {
	WebDriver driver;
	public StaffInfoModifypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//strong[text()='Staff Memeber Modifications']")
	private WebElement staffInfomodiBtn;
	@FindBy(xpath="//a[text()='Staff Info']")
	private WebElement MainstaffInfoBtn;
	@FindBy(xpath="//strong[text()='Staff Information Modify']")
	private WebElement  staffInfoBtn;

	@FindBy(xpath="//input[contains(@placeholder,'Blood Group')]")
	private WebElement  staffInfoEdt;
	@FindBy(xpath="//button[text()='Search']")
	private WebElement staffsearchBtn;
	@FindBy(xpath="//a[text()='Update']")
	private WebElement staffupdateBtn;
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement staffDeleteBtn;
	@FindBy(xpath="//a[text()='Go Back!']")
	private WebElement staffGoBackBtn;
	@FindBy(id="patifn")
	private WebElement FnamemodiEdt;
	@FindBy(id="patsn")
	private WebElement LnamemodiEdt;
	
	@FindBy(xpath="//input[@type='date']")
	private WebElement DOBmodiwidget;
	
	@FindBy(xpath="//input[@name='em']")
	private WebElement emailmodiEdt;
	@FindBy(xpath="//select[@id='gen']")
	private WebElement gendermodiDB;	
	@FindBy(xpath="//select[@id='bog']")
	private WebElement staffmodiDB;
	@FindBy(xpath="//select[@id='wot']")
	private WebElement worktmodiDB;	
	@FindBy(xpath="//input[@id='addr']")
	private WebElement addressmodiEdt;
	@FindBy(xpath="//input[@id='tel']")
	private WebElement MobleNumbermodiEdt;
	@FindBy(xpath="//select[@id='fieldsac']")
	private WebElement ActiveFieldmodiDB;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updatedmodiBtn;
	public WebElement getStaffInfomodiBtn() {
		return staffInfomodiBtn;
	}
	public WebElement getMainstaffInfoBtn() {
		return MainstaffInfoBtn;
	}
	public WebElement getStaffInfoBtn() {
		return staffInfoBtn;
	}
	public WebElement getStaffInfoEdt() {
		return staffInfoEdt;
	}
	public WebElement getStaffsearchBtn() {
		return staffsearchBtn;
	}
	public WebElement getStaffupdateBtn() {
		return staffupdateBtn;
	}
	public WebElement getStaffDeleteBtn() {
		return staffDeleteBtn;
	}
	public WebElement getStaffGoBackBtn() {
		return staffGoBackBtn;
	}
	public WebElement getFnamemodiEdt() {
		return FnamemodiEdt;
	}
	public WebElement getLnamemodiEdt() {
		return LnamemodiEdt;
	}
	public WebElement getDOBmodiwidget() {
		return DOBmodiwidget;
	}
	public WebElement getEmailmodiEdt() {
		return emailmodiEdt;
	}
	public WebElement getGendermodiDB() {
		return gendermodiDB;
	}
	public WebElement getStaffmodiDB() {
		return staffmodiDB;
	}
	public WebElement getWorktmodiDB() {
		return worktmodiDB;
	}
	public WebElement getAddressmodiEdt() {
		return addressmodiEdt;
	}
	public WebElement getMobleNumbermodiEdt() {
		return MobleNumbermodiEdt;
	}
	public WebElement getActiveFieldmodiDB() {
		return ActiveFieldmodiDB;
	}
	public WebElement getUpdatedmodiBtn() {
		return updatedmodiBtn;
	}


}

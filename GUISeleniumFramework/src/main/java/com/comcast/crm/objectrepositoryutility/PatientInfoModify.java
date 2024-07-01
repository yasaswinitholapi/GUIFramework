package com.comcast.crm.objectrepositoryutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientInfoModify {
	WebDriver driver;
	public PatientInfoModify(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getMainstaffInfoBtn() {
		return MainstaffInfoBtn;
	}
	public WebElement getPatientInfoBtn() {
		return patientInfoBtn;
	}
	public WebElement getPatientInfoEdt() {
		return patientInfoEdt;
	}
	public WebElement getPatientsearchBtn() {
		return patientsearchBtn;
	}
	public WebElement getPatientupdateBtn() {
		return patientupdateBtn;
	}
	public WebElement getPatientDeleteBtn() {
		return patientDeleteBtn;
	}
	public WebElement getPatientGoBackBtn() {
		return patientGoBackBtn;
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
	public WebElement getPatientbloodgroupDB() {
		return patientbloodgroupDB;
	}
	public WebElement getPatientAgeDB() {
		return patientAgeDB;
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
	@FindBy(xpath="//a[text()='Staff Info']")
	private WebElement MainstaffInfoBtn;
	@FindBy(xpath="//strong[text()='Patient Information Modify']")
	private WebElement  patientInfoBtn;
	@FindBy(xpath="//input[contains(@placeholder,'Blood Group')]")
	private WebElement  patientInfoEdt;
	@FindBy(xpath="//button[text()='Search']")
	private WebElement patientsearchBtn;
	@FindBy(xpath="//a[text()='Update']")
	private WebElement patientupdateBtn;
	@FindBy(xpath="//a[text()='Delete']")
	private WebElement patientDeleteBtn;
	@FindBy(xpath="//a[text()='Go Back!']")
	private WebElement patientGoBackBtn;
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
	private WebElement patientbloodgroupDB;
	@FindBy(xpath="//input[@name='age']")
	private WebElement patientAgeDB;
	
	@FindBy(xpath="//input[@id='addr']")
	private WebElement addressmodiEdt;
	@FindBy(xpath="//input[@id='tel']")
	private WebElement MobleNumbermodiEdt;
	@FindBy(xpath="//select[@id='fieldsac']")
	private WebElement ActiveFieldmodiDB;
	@FindBy(xpath="//button[text()='Update']")
	private WebElement updatedmodiBtn;
}

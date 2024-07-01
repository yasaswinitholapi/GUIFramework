package com.GUISelenium.HMS.StaffInfo;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AddStaffMemberPage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.StaffInfoDetailsPage;
import com.comcast.crm.objectrepositoryutility.StaffInfoModifypage;

public class AddStaffMemberSysTest extends BaseClass{
	@Test

public void AddStaffMemberSys() throws Throwable {	
	WebDriverUtility wLib = new WebDriverUtility();
	LoginPage lp=new LoginPage(driver);
	/*implictwait for the page using WebDriverUtility */		
	wLib.waitForPageToLoad(driver);
	Home hp = new Home(driver);
	UtilityClassObject.getTest().log(Status.INFO, "navigate to StaffInfo page");
	/* Navigating to staff info page */
	hp.getStaffInfoBtn().click();
	Reporter.log("navigate to StaffInfo page");
	
	/* Navigate to AddStaffMember  page */
	hp.getAddStaffMemberBtn().click();
	Reporter.log("Navigate to AddStaffMember  page");
	driver.manage().window().maximize();
	AddStaffMemberPage addstaffpage = new AddStaffMemberPage(driver);
	
	/* enter  firstName into  firstName textfeld  */
	String firstName = eLib.getDataFromExcel("staffMember", 1, 2);
	addstaffpage.getFnameEdt().sendKeys(firstName);
	Reporter.log("enter  firstName into  firstName textfeld ");
	
	/* enter  lastName into  firstName textfeld  */
	String lastName =eLib.getDataFromExcel("staffMember", 1, 3);
	addstaffpage.getLnameEdt().sendKeys(lastName);
	Reporter.log("enter  lastname into  lastname textfeld ");
	
	/* enter  address into  address textfeld  */
	String address =eLib.getDataFromExcel("staffMember", 1, 4);
	addstaffpage.getAddressEdt().sendKeys(address);
	
	/* enter  mobileNumber into  mobileNumber textfeld  */
	String mobileNumber=eLib.getDataFromExcel("staffMember", 2, 5)+jLib.getRandomNumber();
	addstaffpage.getMobleNumberEdt().sendKeys(mobileNumber);
	
	/* enter  email into  email textfeld  */
	String email=eLib.getDataFromExcel("staffMember", 2, 6)+jLib.getRandomNumber();
	addstaffpage.getEmailEdt().sendKeys(email);
	
	/*select gender from gender dropdow*/	
	wLib.select(addstaffpage.getGenderDB(), 1);
	
	/* enter  dob into  dob textfeld  */
	String dob=eLib.getDataFromExcel("staffMember", 1, 8);
	addstaffpage.getDOBwidget().sendKeys(dob);
	/* select staff type from staffdropdown  */
	wLib.select(addstaffpage.getStaffDB(), 1);
	/* select  getWorkt from Worktdropdown  */
	wLib.select(addstaffpage.getWorktDB(), 1);
	/* click on  SubmtBtn */
	addstaffpage.getAddstaffSubmtBtn().click();
	Reporter.log("click on  SubmtBtn");
	StaffInfoModifypage staffmod=new StaffInfoModifypage(driver);
	/* Navigate to StaffInfomodi  page */
	staffmod.getStaffInfomodiBtn().click();
	
	/* fetch the  data from propertes fle  */
	String URL = System.getProperty("surl" ,fLib.getDataFromPropertiesFile("surl") );
	String USERNAME = System.getProperty("susername" , fLib.getDataFromPropertiesFile("susername"));
	String PASSWORD = System.getProperty("spassword" , fLib.getDataFromPropertiesFile("spassword"));
	
	/* login into superapp page    */
	lp.loginTosuperapp(URL, USERNAME, PASSWORD);
	Reporter.log("login To Application");
	Thread.sleep(5000);
	/* Navigate to StaffInfo  page */
	staffmod.getStaffInfoBtn().click();
	Reporter.log("Navigate to StaffInfo  page");
	
	/*enter moble no into search textfeld*/
	staffmod.getStaffInfoEdt().sendKeys(mobileNumber);
	/*click on  search button*/
	staffmod.getStaffsearchBtn();
	Reporter.log("clc on  search button");
	UtilityClassObject.getTest().log(Status.INFO, "fgh");
	
	/*update the ModFname */
	String ModFname=eLib.getDataFromExcel("staffMember", 1, 12);
	staffmod.getFnamemodiEdt().sendKeys(ModFname);
	/*click on  update button*/
	staffmod.getUpdatedmodiBtn();
	Reporter.log("click on  update button");
	StaffInfoDetailsPage StaffInfoDeta=new StaffInfoDetailsPage(driver);
	StaffInfoDeta.getStaffInfoDetailsBtn().click();
	String expectedFModFname=driver.findElement(By.xpath("//td[contains(text(),'firstName lastName']")).getText();
	Assertion hardAssert = new Assertion();
	//hardAssert.assertTrue(ModFname.contains(firstName));
	hardAssert.assertNotEquals(expectedFModFname,firstName );
}

	
}
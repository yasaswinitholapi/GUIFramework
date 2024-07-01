package com.GUISelenium.HMS.StaffInfo;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.PatientInfoModify;
import com.comcast.crm.objectrepositoryutility.StaffInfoModifypage;

public class PatientInfoModifyTest extends BaseClass {
@Test
public void PatientInfoModi() throws Throwable {
	WebDriverUtility wLb=new  WebDriverUtility();
	LoginPage lp=new LoginPage(driver);
	/*implictwait for the page usng WebDriverUtility */	
	wLb.waitForPageToLoad(driver);
	Home hp=new Home(driver);
	/* Navigating to staff info page */
	UtilityClassObject.getTest().log(Status.INFO, "navigate to StaffInfo page");
	hp.getStaffInfoBtn();
	Reporter.log("Navigating to staff info page ");
	
	StaffInfoModifypage staffmod=new StaffInfoModifypage(driver);
	/* Navigate to staffinfomodify page */
	UtilityClassObject.getTest().log(Status.INFO, "navigate to staffinfomodify page");
	staffmod.getStaffInfomodiBtn().click();
	Reporter.log("Navigate to staffinfomodify page");
	
	/*fetch the data from properties file*/	
	String URL = System.getProperty("surl" ,fLib.getDataFromPropertiesFile("surl") );
	Reporter.log("fetch URL data from properties file");
	
	String USERNAME = System.getProperty("susername" , fLib.getDataFromPropertiesFile("susername"));
	Reporter.log("fetch USERNAME data from properties file");
	
	String PASSWORD = System.getProperty("spassword" , fLib.getDataFromPropertiesFile("spassword"));
	Reporter.log("fetch PASSWORD data from properties file");
	
	/*loginTosuperappn page*/	
	lp.loginTosuperapp(URL, USERNAME, PASSWORD);
	Reporter.log("loginTosuperappn page");
	
	PatientInfoModify PatientInfo=new PatientInfoModify(driver);
	/* Navigate to PatientInfo page */
	UtilityClassObject.getTest().log(Status.INFO, "navigate to PatientInfo page");
	PatientInfo.getPatientInfoBtn().click();
	Reporter.log("Navigate to PatientInfo page");
	
	/* Click on patienInformationModification */
	UtilityClassObject.getTest().log(Status.INFO, "Click on patienInformationModification");
	Reporter.log("Click on patienInformationModification");
	
	/* Enter REGNO    */
	UtilityClassObject.getTest().log(Status.INFO, "Enter REGNO");
	String REGNO=eLib.getDataFromExcel("patientInfomodify", 1, 2);
	PatientInfo.getPatientInfoEdt().sendKeys("REGNO");
	Reporter.log("Enter REGNO");
	
	/*Click on Searchbutton*/
	UtilityClassObject.getTest().log(Status.INFO, "Click on Searchbutton");
	PatientInfo.getPatientsearchBtn().click();
	Reporter.log("Click on Searchbutton");
	
	/* enter frstname into frstname textfeld*/
	UtilityClassObject.getTest().log(Status.INFO, "enter frstname into frstname textfeld");
	String   firstname=eLib.getDataFromExcel("patientInfomodify", 1, 3);
	PatientInfo.getFnamemodiEdt().sendKeys(null);
	Reporter.log("enter frstname into frstname textfeld");
	
	String   lastname=eLib.getDataFromExcel("patientInfomodify", 1, 4);
	/* Click on update button*/	
	UtilityClassObject.getTest().log(Status.INFO, "Click on update button");
	PatientInfo.getUpdatedmodiBtn().click();
	Reporter.log("Click on update button");
	String expectedFModFname=driver.findElement(By.xpath("//td[contains(text(),'firstName lastName']")).getText();
	Assertion hardAssert = new Assertion();
	//hardAssert.assertTrue(ModFname.contains(firstName));
	hardAssert.assertNotEquals(expectedFModFname,firstname);
}
}

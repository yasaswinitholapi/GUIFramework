package com.GUISelenium.HMS.StaffInfo;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.AddStaffMemberPage;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.LoginPage;
import com.comcast.crm.objectrepositoryutility.StaffInfoDetailsPage;
import com.comcast.crm.objectrepositoryutility.StaffInfoModifypage;

/**
 * @author Yasaswini
 */

public class StaffMemerModificationTest extends BaseClass {
	@Test
	public void StaffMemerModification() throws Throwable {
		Home hp = new Home(driver);
		WebDriverUtility wLib = new WebDriverUtility();
		LoginPage lp = new LoginPage(driver);
		/* implictwait for the page usng WebDriverUtility */
		wLib.waitForPageToLoad(driver);
		StaffInfoModifypage staffmod = new StaffInfoModifypage(driver);
		
		/* Navigating to staffinfomodi page */
		UtilityClassObject.getTest().log(Status.INFO, "navigate to staffinfomodi page");
		staffmod.getStaffInfomodiBtn().click();
		Reporter.log("Navigating to staffinfomodi page");
		
		/* fetch the  data from properties file */
		String URL = System.getProperty("surl", fLib.getDataFromPropertiesFile("surl"));
		String USERNAME = System.getProperty("susername", fLib.getDataFromPropertiesFile("susername"));
		String PASSWORD = System.getProperty("spassword", fLib.getDataFromPropertiesFile("spassword"));
		
		/* login into superapp page */
		UtilityClassObject.getTest().log(Status.INFO, "login into superapp page ");
		lp.loginTosuperapp(URL, USERNAME, PASSWORD);
		Reporter.log("login into superapp page");
		
		Thread.sleep(5000);
		/* Navigate to StaffInfo page */
		UtilityClassObject.getTest().log(Status.INFO, "Navigate to StaffInfo page ");
		staffmod.getStaffInfoBtn().click();
		Reporter.log("login into StaffInfo  page");
		
		/* enter moble no into search textfeld */
		String mobileNumber = eLib.getDataFromExcel("staffMember", 2, 5) + jLib.getRandomNumber();
		staffmod.getMobleNumbermodiEdt().sendKeys(mobileNumber);
		/* click on search button */
		UtilityClassObject.getTest().log(Status.INFO, "click on search button ");
		staffmod.getStaffsearchBtn();
		Reporter.log("click on search button");
		String firstName=eLib.getDataFromExcel("", 1, 2);
		
		/* update the ModFname */
		String ModFname = eLib.getDataFromExcel("staffMember", 1, 12);
		staffmod.getFnamemodiEdt().sendKeys(ModFname);
		/* click on update button */
		UtilityClassObject.getTest().log(Status.INFO, "click on  update button");
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

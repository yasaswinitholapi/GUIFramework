package com.GUISelenium.HMS.StaffInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
import com.comcast.crm.objectrepositoryutility.StaffInfoDetailsPage;
import com.comcast.crm.objectrepositoryutility.StaffInfoModifypage;

public class AddStaffMemberTest extends BaseClass {
	@Test
	public void add() throws Throwable {
		WebDriverUtility wLib = new WebDriverUtility();
		/*implictwait for the page usng WebDriverUtility */		
		wLib.waitForPageToLoad(driver);
		UtilityClassObject.getTest().log(Status.INFO, "navigate to StaffInfo page");
		Reporter.log("navigate to StaffInfo page");
		Home hp = new Home(driver);
		UtilityClassObject.getTest().log(Status.INFO, "navigate to AddStaffMember page");
		/* Navigating to staff info page */
		hp.getStaffInfoBtn().click();
		/* Navigating to AddStaffMember page */
		hp.getAddStaffMemberBtn().click();
		driver.manage().window().maximize();
		Reporter.log("maximize the wndows");		
		/* Navigating to staff info page*/
		AddStaffMemberPage addstaffpage = new AddStaffMemberPage(driver); 
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");	
		
		/*read firstName data from excel*/		
		String firstName = eLib.getDataFromExcel("staffMember", 1, 2);
		Reporter.log("read firstName data from excel ");
		addstaffpage.getFnameEdt().sendKeys(firstName);
		
		/* read lastName data from excel*/	
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String lastName =eLib.getDataFromExcel("staffMember", 1, 3);
		addstaffpage.getLnameEdt().sendKeys(lastName);
		Reporter.log("read lastName data from excel ");
		
		/* read address data from excel*/
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String address =eLib.getDataFromExcel("staffMember", 1, 4);
		addstaffpage.getAddressEdt().sendKeys(address);
		Reporter.log("read address data from excel");
		
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		/*read mobileNumber data from excel*/		
		String mobileNumber=eLib.getDataFromExcel("staffMember", 1, 5)+jLib.getRandomNumber();
		addstaffpage.getMobleNumberEdt().sendKeys(mobileNumber);
		Reporter.log("read mobileNumber data from excel");
		
		/*read email data from excel*/		
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String email=eLib.getDataFromExcel("staffMember", 1, 6)+jLib.getRandomNumber();
		addstaffpage.getEmailEdt().sendKeys(email);
		Reporter.log("read email data from excel");
		
		/*select gender from dropdown*/	
		wLib.select(addstaffpage.getGenderDB(), 1);
		Reporter.log("select gender from dropdown");
		
		/* fetch dob from excel*/	
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String dob=eLib.getDataFromExcel("staffMember", 1, 8);
		addstaffpage.getDOBwidget().sendKeys(dob);
		Reporter.log("fetch dob from excel");
		
		/* select stafftype  from excel*/
		wLib.select(addstaffpage.getStaffDB(), 1);
		Reporter.log("fetch stafftype from excel");
		
		/* select Worktme  from excel*/
		wLib.select(addstaffpage.getWorktDB(), 1);
		Reporter.log("fetch Worktme from excel");
		
		/*click on SubmtBtn*/	
		addstaffpage.getAddstaffSubmtBtn().click();
		Reporter.log("click on SubmtBt");
		
		StaffInfoDetailsPage StaffDetails=new StaffInfoDetailsPage(driver);
		/* Navigating to StaffInfoDetails page */
		StaffDetails.getStaffInfoDetailsBtn().click();
		Reporter.log("Navigating to StaffInfoDetails page");
		
		/* fetch  partialurl from excel  */
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String partialurl=eLib.getDataFromExcel("staffMember", 1, 11);
        wLib.switchToTabOnURL(driver,partialurl);	
        Reporter.log("fetch  partialurl from excel &swtch to taffInfoDetails page ");
        
        String expectedStaffName=driver.findElement(By.xpath("//td[text()='"+firstName+" "+ lastName+"']")).getText();
    	Assertion hardAssert = new Assertion();
		/*verfy  staff regster member present n StaffInfoDetailspage*/ 
    	hardAssert.assertTrue(expectedStaffName.contains(firstName));
        Reporter.log("verfy  staff regster member present n StaffInfoDetailspage ");
        
        
	}
}

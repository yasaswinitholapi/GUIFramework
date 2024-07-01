package com.GUISelenium.HMS.StaffInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.comcast.crm.generic.basetest.BaseClass;
import com.comcast.crm.generic.webdriverutility.UtilityClassObject;
import com.comcast.crm.generic.webdriverutility.WebDriverUtility;
import com.comcast.crm.objectrepositoryutility.Home;
import com.comcast.crm.objectrepositoryutility.PatientAdmitedInvoice;

public class AdmittedPatientInfoTest extends BaseClass {
	@Test
	public void AdmittedPatientInfo() throws Throwable {

		WebDriverUtility wLib = new WebDriverUtility();
		/* mplctwat s gven usng webdrverutlty */
		wLib.waitForPageToLoad(driver);
		/* Click on Admited Patient Informations */
		UtilityClassObject.getTest().log(Status.INFO, "navigate to AdmittedPatientInfo page");
		Home hp = new Home(driver);
		UtilityClassObject.getTest().log(Status.INFO, "AdmitedPatientInformation page");
		hp.getAdmitedPatientInformationBtn().click();
		Reporter.log("Click on Admited Patient Informations");

		UtilityClassObject.getTest().log(Status.INFO, "AdmitedPatientInvoice page");
		PatientAdmitedInvoice patientAdmitedInv = new PatientAdmitedInvoice(driver);
		/* Click on Admited Patient Informations */
		patientAdmitedInv.getDischargelink().click();
		Reporter.log("Click on Dischargelink");

		Thread.sleep(5000);
		/* Check whether expectedPatientname and Patientname are same */
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String patname = eLib.getDataFromExcel("patientInvoice", 1, 2);
		String expectedpatname = driver.findElement(By.xpath("//td[contains(text(),'" + patname + "')]")).getText();
		Reporter.log("Check whether expectedPatientname and Patientname are same");

		Assertion hardAssert = new Assertion();
		hardAssert.assertTrue(expectedpatname.contains(patname));
		Reporter.log("verfy  staff regster member present n StaffInfoDetailspage ");
		
		PatientAdmitedInvoice Pa = new PatientAdmitedInvoice(driver);
		/* if it is available then click on discharge link */
		Pa.getDischargelink().click();
		Reporter.log("click on discharge link");
		
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		/* Switch to patientInvoice window by fetching the partialurl */
		String partialurl = eLib.getDataFromExcel("patientInvoice", 1, 6);
		wLib.switchToTabOnURL(driver, partialurl);
		Reporter.log("Switch to patientInvoice page");
		
		/* Enter medicineCharge nto medicineCharge textfeld */
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String medicineCharge = eLib.getDataFromExcel("patientInvoice", 1, 3);
		patientAdmitedInv.getMedicineChargeEdt().sendKeys(medicineCharge);
		Reporter.log("Enter medicineCharge nto medicineCharge textfeld");
		
		/* Enter doctorCharge nto medicineCharge textfeld */
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String doctorCharge = eLib.getDataFromExcel("patientInvoice", 1, 4);
		patientAdmitedInv.getDoctorChargeEdt().sendKeys(doctorCharge);
		Reporter.log("Enter doctorCharge nto medicineCharge textfeld");
		
		/* Enter countofdays into medicineCharge textfeld */
		UtilityClassObject.getTest().log(Status.INFO, "read data from excel");
		String countofdays = eLib.getDataFromExcel("patientInvoice", 1, 5);
		patientAdmitedInv.getCountofdaysEdt().sendKeys(countofdays);
		Reporter.log("Enter countofdays into medicineCharge textfeld");
		
		patientAdmitedInv.getPatentSUBMITBtn().click();
		UtilityClassObject.getTest().log(Status.INFO, patname + "===> Patient is dismissed from the hosptal");
		Reporter.log("Patient is dismissed from the hosptal");

	}
}

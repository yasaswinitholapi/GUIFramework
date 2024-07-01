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
public class LoginPage extends WebDriverUtility{                              // Rule-1  create a separte java class
                           
	WebDriver driver;
	 public LoginPage(WebDriver driver) {             //Rule 3 : Object Initialization
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	                           
	@FindBy(xpath="//input[@name='sadmun']")                        // Rule-2 Object Creation
	private WebElement usernameEdt;
	
	@FindBy(xpath="//input[@name='sadmpw']")
	private WebElement passwordEdt;
	
	@FindBy(xpath="//button[text()='SUBMIT']")
	private WebElement submitBtn;
	     
	
	                                             
	public WebElement getUsernameEdt() {            //Rule-4 : Object Encapsulation
		return usernameEdt;                        //Rule-5 : Object Utilization
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}
		
public WebElement getSubmitBtn() {
		return submitBtn;
	}

/**
 *  login to application based username , password , url argumnets 
 * @param url
 * @param username
 * @param password
 */
	 public void loginToapp(String url , String username , String password) {
		 waitForPageToLoad(driver);
		 driver.get(url);	
		 driver.manage().window().maximize();
		 usernameEdt.sendKeys(username);
		 passwordEdt.sendKeys(password);
		 submitBtn.click();
	 }
	 public void loginTosuperapp(String surl , String susername , String spassword) throws InterruptedException {
//		 waitForPageToLoad(driver);
//		 driver.get(surl);	
		// driver.manage().window().maximize();
		 usernameEdt.sendKeys(susername);
		 passwordEdt.sendKeys(spassword);
		 Thread.sleep(5000);
		 submitBtn.click();
	 }
	
}

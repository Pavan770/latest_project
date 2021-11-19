package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class LoginPageObjects extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//*[@id='userId']")
	public static WebElement userName;

	@FindBy(xpath = "//*[@id='userPassword']")
	public static WebElement password;

	@FindBy(xpath = "//span[normalize-space()='Submit']")
	public static WebElement submitButton;

	@FindBy(xpath = "(//*[contains(@class,'authenticateInputFieldsContainer ng-star-inserted')]//input)[1]")
	public static WebElement securityone;

	@FindBy(xpath = "(//*[contains(@class,'authenticateInputFieldsContainer ng-star-inserted')]//input)[2]")
	public static WebElement securitytwo;

	@FindBy(xpath = "(//*[contains(text(),' Submit ')])[2]")
	public static WebElement submitButtonone;

	@FindBy(xpath = "//*[contains(@class,'mat-simple-snackbar ng-star-inserted')]")
	public static WebElement loadingIcon1;

	@FindBy(xpath = "//span[@title='Sign Up']")
	public static WebElement signup;

	public LoginPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	/*public EwayBillPageObjects login(String uname, String pswd, String SQ1, String SQ2, EwayBillPageObjects ewaybillpo)
			throws Throwable {
		
		testcase = extentReport.createTest("Verify Login Testcase");
		// action.scrollByVisibilityOfElement(getDriver(), userName);
	//	action.explicitWait(getDriver(), userName, 10);
		action.type(userName, uname);
		action.type(password, pswd);
		action.JSClick(getDriver(), submitButton);
		Thread.sleep(2000);
		testcase = extentReport.createTest("Verify Security Question one");
		testcase.info("Security Question One");
		onefactorauth(securityone, SQ1);
		Thread.sleep(2000);
		testcase = extentReport.createTest("Verify Security Question Two");
		testcase.info("Security Question Two");
		twofactorauth(securitytwo, SQ2);
		Thread.sleep(1000);
		testcase.pass("Security Question Two is passed");
		testcase = extentReport.createTest("verify Submit Button");
		testcase.info("Submit Button");
		action.JSClick(getDriver(), submitButtonone);
		testcase.info("Login successfully");
		testcase.pass("login is passed");
		ewaybillpo = new EwayBillPageObjects();
		return ewaybillpo;
	}
*/
	
	
	public LocationsPageObjects login(String uname, String pswd, String SQ1, String SQ2, LocationsPageObjects locationpage)
			throws Throwable {
		
		testcase = extentReport.createTest("Verify Login Testcase");
		// action.scrollByVisibilityOfElement(getDriver(), userName);
	//	action.explicitWait(getDriver(), userName, 10);
		action.type(userName, uname);
		action.type(password, pswd);
		action.JSClick(getDriver(), submitButton);
		Thread.sleep(2000);
		testcase = extentReport.createTest("Verify Security Question one");
		testcase.info("Security Question One");
		onefactorauth(securityone, SQ1);
		//Thread.sleep(2000);
		testcase = extentReport.createTest("Verify Security Question Two");
		testcase.info("Security Question Two");
		twofactorauth(securitytwo, SQ2);
		Thread.sleep(1000);
		testcase.pass("Security Question Two is passed");
		testcase = extentReport.createTest("verify Submit Button");
		testcase.info("Submit Button");
		action.JSClick(getDriver(), submitButtonone);
		testcase.info("Login successfully");
		testcase.pass("login is passed");
		locationpage = new LocationsPageObjects();
		return locationpage;
	}

}

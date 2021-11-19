package com.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class LocationsPageObjects extends BaseClass {
	static Logger logger = Logger.getLogger(LoginPageObjects.class);
	Action action = new Action();

	@FindBy(xpath = "//*[contains(text(),'Locations')]")
	private static WebElement loc;

	@FindBy(xpath = "//*[contains(text(),'add_circle')]")
	private static WebElement addloc;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Location Name')]")
	private static WebElement locname;

	@FindBy(xpath = "//*[contains(@data-placeholder,'First Name')]")
	private static WebElement FN;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Last Name')]")
	private static WebElement LN;

	@FindBy(xpath = "//*[contains(@data-placeholder,'User ID')]")
	private static WebElement Uid;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Email ID')])[1]")
	private static WebElement Emailid;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Address Line 1')])[1]")
	private static WebElement Addline1;

	@FindBy(xpath = "(//*[contains(text(),'Select Country')])[1]")
	private static WebElement cou;

	@FindBy(xpath = "//*[contains(text(),'India')]")
	private static WebElement cou1;

	@FindBy(xpath = "(//*[contains(text(),'Select State')])[1]")
	private static WebElement ss;

	@FindBy(xpath = "//*[contains(text(),'Telangana')]")
	private static WebElement ss1;

	@FindBy(xpath = "(//*[contains(text(),'Select State')])[1]")
	private static WebElement selstate;

	@FindBy(xpath = "(//*[contains(text(),'Select City')])[1]")
	private static WebElement selcity;

	@FindBy(xpath = "//*[contains(text(),'Hyderabad')]")
	private static WebElement selcity1;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Pin/Zip Code')])[1]")
	private static WebElement Pincode;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Corporate Email ID')])[1]")
	private static WebElement corpemailid;

	@FindBy(xpath = "//*[contains(@name,'Same as Parent Org.')]")
	private static WebElement checkbox;

	@FindBy(xpath = "//*[contains(@name,'Same as Head office address')]")
	private static WebElement checkbox1;

	@FindBy(xpath = "//*[contains(text(),' Save and Proceed ')]")
	private static WebElement sp;

	public LocationsPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public void locationcreation1() throws Throwable {
		Thread.sleep(5000);
		action.JSClick(getDriver(), loc);
		Thread.sleep(5000);
		action.JSClick(getDriver(), addloc);
	}

	public void locationcreation(String lc, String Fn, String Ln, String uid, String emailid, String addline1,
			String selectcountry, String Selectstate, String Selectcity, String pincode, String coremailid)
			throws Throwable {

		testcase = extentReport.createTest("Verify Location creation Testcase");
		Thread.sleep(1000);
		testcase = extentReport.createTest("Verify Location name");
		testcase.info("Location name");
		action.type(locname, lc);
		testcase.pass("Location name is passed");
		testcase = extentReport.createTest("Verify First name");
		testcase.info("First name");
		action.type(FN, Fn);
		testcase.pass("First name");
		action.type(LN, Ln);
		action.type(Uid, uid);
		action.scrollByVisibilityOfElement(getDriver(), Emailid);
		action.type(Emailid, emailid);
		action.type(Addline1, addline1);
		action.JSClick(getDriver(), cou);

		action.JSClick(getDriver(), cou1);
		action.type(selstate, Selectstate);
		action.JSClick(getDriver(), ss);

		action.JSClick(getDriver(), ss1);
		action.JSClick(getDriver(), selcity);
		action.JSClick(getDriver(), selcity1);
		action.type(selcity, Selectcity);
		action.type(Pincode, pincode);
		action.type(corpemailid, coremailid);
		// action.JSClick(getDriver(), checkbox);
		action.JSClick(getDriver(), checkbox1);
		action.JSClick(getDriver(), sp);

	}

}

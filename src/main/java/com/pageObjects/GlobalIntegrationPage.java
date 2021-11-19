package com.pageObjects;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class GlobalIntegrationPage extends BaseClass {
	static Logger logger = Logger.getLogger(GlobalIntegrationPage.class);

	Action action = new Action();

	@FindBy(xpath = "//*[contains(text(),'Integrations')]")
	public static WebElement integ;

	@FindBy(xpath = "//*[contains(text(),'add_circle')]")
	public static WebElement addbut;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Name')])[1]")
	public static WebElement name;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Server Address')])[1]")
	public static WebElement serAdd;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Port')])[1]")
	public static WebElement port;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Folder Path')])[1]")
	public static WebElement fpath;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Name')])[2]")
	public static WebElement username;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Password')])[1]")
	public static WebElement pwd;
	
	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[3]")
	public static WebElement sshftp;
	
	@FindBy(xpath = "(//span[@class='mat-radio-outer-circle'])[5]")
	public static WebElement addkey;
	
	@FindBy(xpath = "//textarea[@data-placeholder='Encrypted Key']")
	public static WebElement ekey;
	

	@FindBy(xpath = "//*[contains(text(),'Test Connection')]")
	public static WebElement tc;

	@FindBy(xpath = "//*[contains(text(),'Save')]")
	public static WebElement save;
	
	@FindBy(xpath = "//span[text()='Connected sucessfully']")
	public static WebElement val;
	
	@FindBy(xpath = "//*[contains(@class,'loaderMessage')]")
	public static WebElement existname;

	public GlobalIntegrationPage() {

		PageFactory.initElements(getDriver(), this);
	}

	public void Globalintcreation(String Nm, String Sa, String pt, String Fp, String un,

			String Ekey) throws Throwable {

		testcase = extentReport.createTest("Verify Globalintegration creation Testcase");
		Thread.sleep(1000);
		action.JSClick(getDriver(), integ);
		action.JSClick(getDriver(), addbut);
		testcase = extentReport.createTest("verify name");
		testcase.info("Name");
		action.type(name, Nm);
		action.type(serAdd, Sa);
		action.type(port, pt);
		action.type(fpath, Fp);
		action.type(username, un);
		//action.type(pwd, Pwd);
		action.JSClick(getDriver(), sshftp);
		action.JSClick(getDriver(), addkey);
		action.scrollByVisibilityOfElement(getDriver(), ekey);
		action.type(ekey, Ekey);
		action.JSClick(getDriver(), tc);
		action.JSClick(getDriver(), save);
		/*String actualstate = val.getText();
		String expected="Connected sucessfully";
		Assert.assertEquals(actualstate, expected);
		System.out.println("Connected sucessfully");*/
		
		//Type2 partiall
	//	Assert.assertTrue(actualstate.contains(""));
		
		

	}

}

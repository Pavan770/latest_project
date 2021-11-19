package com.pageObjects;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;
import com.app.utility.ExcelApiTest;

public class AppIntegrationpage extends BaseClass {
	Random r = new Random();

	Action action = new Action();

	@FindBy(xpath = "(//*[contains(text(),'Apps')])[1]")
	private static WebElement Appsmenu;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search App')])[1]")
	private static WebElement searchApp;

	@FindBy(xpath = "(//*[contains(@title,'Outward E-Way Bills')])[1]")
	private static WebElement selectapp;

	@FindBy(xpath = "//*[contains(text(),'Inbound Integrations')]")
	public static WebElement inbound;

	@FindBy(xpath = "//*[contains(text(),'add_circle')]")
	public static WebElement addbut;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Configuration Name')])[1]")
	public static WebElement configname;

	@FindBy(xpath = "(//*[contains(text(),'Chain')])[1]")
	public static WebElement chain;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search')])[2]")
	public static WebElement chainsearch;

	@FindBy(xpath = "(//*[contains(text(),'E-waybill-Inbound-1.03')])[5]")
	public static WebElement chainselec;
	

	@FindBy(xpath = "(//span[contains(@class,'mat-select-placeholder mat-select-min-line')])[1]")
	public static WebElement sourname;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public static WebElement selsourcename;

	@FindBy(xpath = "(//span[contains(@class,'mat-select-placeholder mat-select-min-line')])[1]")
	public static WebElement intmethod;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	public static WebElement ftpint;

	@FindBy(xpath = "(//span[contains(@class,'mat-select-placeholder mat-select-min-line')])[3]")
	public static WebElement config;

   /* @FindBy(xpath = "(//input[@data-placeholder='Search'])[2]")
	public static WebElement configsear;*/
	
	@FindBy(xpath= "(//span[@class='mat-option-text'])[2]")
	public static WebElement consel;

	@FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[2]")
	public static WebElement relfolpath;

	@FindBy(xpath = "//*[contains(text(),'Test Connection')]")
	public static WebElement testcon;

	@FindBy(xpath = "//*[contains(text(),'Save')]")
	public static WebElement save;
	
	@FindBy(xpath = "//*[contains(text(),' Run Now ')]")
	public static WebElement runnow;
	
	@FindBy(xpath = "//*[contains(text(),'Cancel')]")
	public static WebElement can;
	
	
	
	@FindBy(xpath="//span[text()='Configuration triggered successfully']")
	public static WebElement msg;
	

	public AppIntegrationpage() {

		PageFactory.initElements(getDriver(), this);
	}
	
	/*public boolean Randomtype(WebElement ele,String data) throws Throwable {
		String random = ExcelApiTest.generateRandomString2(data);
		boolean flag = false;
				try {
					flag = ele.isDisplayed();
					ele.clear();
					ele.sendKeys();
					// logger.info("Entered text :"+text);
					flag = true;
				} catch (Exception e) {
					System.out.println("Location Not found");
					flag = false;
				} finally {
					if (flag) {
						System.out.println("Successfully entered value");
						
					} else {
						System.out.println("Unable to enter value");
					}

				}
				return flag;
			}*/
	

	public void AppIntegrationcreation() throws Throwable {

		testcase = extentReport.createTest("Verify AppIntegration creation Testcase");
		Thread.sleep(1000);
		action.JSClick(getDriver(), Appsmenu);
		action.explicitWait(getDriver(), searchApp, 30);
		action.type(searchApp, properties.getProperty("app"));
		action.explicitWait(getDriver(), selectapp, 30);
		action.JSClick(getDriver(), selectapp);
		action.explicitWait(getDriver(), inbound, 30);
		action.JSClick(getDriver(), inbound);
		action.JSClick(getDriver(), addbut);
		action.explicitWait(getDriver(), configname, 30);
        action.type(configname, "inv" + r.nextInt());
		action.JSClick(getDriver(), chain);
		action.type(chainsearch, properties.getProperty("chain"));
		action.JSClick(getDriver(), chainselec);
		action.explicitWait(getDriver(), sourname, 30);
		action.JSClick(getDriver(), sourname);
		action.explicitWait(getDriver(), selsourcename, 30);
		action.JSClick(getDriver(), selsourcename);
		action.explicitWait(getDriver(), intmethod, 30);
		action.JSClick(getDriver(), intmethod);
		action.explicitWait(getDriver(), ftpint, 30);
		action.JSClick(getDriver(), ftpint);
		action.JSClick(getDriver(), config);
	    action.explicitWait(getDriver(), consel, 30);
		action.JSClick(getDriver(), consel);
		action.type(relfolpath, properties.getProperty("relflo"));
		action.JSClick(getDriver(), testcon);
		action.JSClick(getDriver(), save);
		action.JSClick(getDriver(), runnow);
		action.JSClick(getDriver(), can);
	}

}

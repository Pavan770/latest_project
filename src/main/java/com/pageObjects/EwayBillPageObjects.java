package com.pageObjects;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class EwayBillPageObjects extends BaseClass{
	static Logger logger = Logger.getLogger(EwayBillPageObjects.class);
	Action action = new Action();
	
	@FindBy(xpath = "(//*[contains(text(),'Apps')])[1]")
	private static WebElement Appsmenu;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search App')])[2]")
	private static WebElement searchApp;

	@FindBy(xpath = "(//*[contains(@title,'Outward E-Way Bills')])[2]")
	private static WebElement selectapp;

	@FindBy(xpath = "(//*[contains(text(),'Process Now')])")
	private static WebElement processnow;

	@FindBy(xpath = "(//*[contains(text(),'menu')])[4]")
	public static WebElement menu;

	@FindBy(xpath = "(//*[contains(text(),'Create New')])[1]")
	public static WebElement createnew;

	@FindBy(xpath = "(//*[contains(text(),'Select Transformation')])[1]")
	public static WebElement selecttranformation;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search')])[2]")
	public static WebElement searchapp;

	@FindBy(xpath = "(//*[contains(text(),' E-waybill-Inbound-1.03 ')])")
	public static WebElement selecttrans;

	@FindBy(xpath = "//span[text()='Choose File']")
	public static WebElement choosefile;

	@FindBy(xpath = "(//*[contains(text(),' Initiate Process ')])[1]")
	public static WebElement initiateprocess;

	@FindBy(xpath = "//*[@id='newInvoicesContainer']/div/div/div/div[2]/div[1]/div[2]/button/span[1]/img")
	public static WebElement reqlogs;

	@FindBy(xpath = "(//*[contains(text(),'visibility')])[8]")
	public static WebElement reqview;

	@FindBy(xpath = "//*[contains(@title,'Refresh Results')]")
	public static WebElement RR;

	@FindBy(xpath = "(//*[contains(@class,'invoiceFeedItem_details row')])[1]")
	public static WebElement row;

	@FindBy(xpath = "(//*[contains(@class,'col-6 no-padding feedValue')])[1]")
	public static WebElement generatedbill;

	@FindBy(xpath = "//*[contains(@class,'headerLogo')]")
	public static WebElement clicklogo;
   
   
   
   public EwayBillPageObjects() {
		PageFactory.initElements(getDriver(), this);

	}

	public PanIndiaPageObjects ewayBills() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		action.JSClick(getDriver(), Appsmenu);

		logger.info("Getting the Eway bill app");
		Thread.sleep(5000);
		action.type(searchApp, properties.getProperty("app"));
		logger.info("Selecting the  app");
		Thread.sleep(3000);
		action.JSClick(getDriver(), selectapp);
		System.out.println("selected app");
		Thread.sleep(5000);
		action.JSClick(getDriver(), processnow);
		Thread.sleep(5000);
		action.JSClick(getDriver(), menu);
		Thread.sleep(3000);
		action.JSClick(getDriver(), createnew);
		Thread.sleep(3000);
		action.JSClick(getDriver(), selecttranformation);
		Thread.sleep(2000);
		action.type(searchapp, properties.getProperty("searchapp"));
		Thread.sleep(2000);
		action.JSClick(getDriver(), selecttrans);
		action.explicitWait(getDriver(), choosefile, 30);
        action.JSClick(getDriver(), choosefile);
		Thread.sleep(5000);
		action.uploadFile(properties.getProperty("filepath"));
		Thread.sleep(4000);
		action.JSClick(getDriver(), initiateprocess);
		Thread.sleep(3000);
		action.JSClick(getDriver(), reqlogs);
		Thread.sleep(3000);
		action.JSClick(getDriver(), reqview);
		Thread.sleep(3000);
		action.JSClick(getDriver(), RR);
		Thread.sleep(3000);
		action.JSClick(getDriver(), row);
		Thread.sleep(3000);
		logger.info("verifying the eway bill number");

		String typevalue = generatedbill.getAttribute("title");
		System.out.print("Eway bill number  :" + typevalue);

		logger.info("End of Eway bill test cases");
		getDriver().navigate().refresh();
		return new PanIndiaPageObjects();

	}


}








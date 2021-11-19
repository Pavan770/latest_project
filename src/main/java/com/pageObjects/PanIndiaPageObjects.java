package com.pageObjects;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class PanIndiaPageObjects extends BaseClass {
	Action action = new Action();

	@FindBy(xpath = "(//*[contains(text(),'Outward E-Way Bills')])[1]")
	public static WebElement Appmenu1;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search App')])")
	public static WebElement searchapp1;

	@FindBy(xpath = "(//*[contains(text(),'EWB-Pan-India')])")
	public static WebElement Selapp1;

	@FindBy(xpath = "(//*[contains(text(),'desktop_mac')])[2]")
	public static WebElement dummy;

	@FindBy(xpath = "(//*[contains(text(),'menu')])[4]")
	public static WebElement menu1;

	@FindBy(xpath = "(//*[contains(text(),'Create New')])[1]")
	public static WebElement createnew1;

	@FindBy(xpath = "(//*[contains(text(),'Select Transformation')])[1]")
	public static WebElement Selecttransone;

	@FindBy(xpath = "(//*[contains(@data-placeholder,'Search')])[2]")
	public static WebElement search1;

	@FindBy(xpath = "(//*[contains(text(),' Input Standard(XLSX)-1.03 ')])")
	public static WebElement seletrans1;

	@FindBy(xpath = "//span[text()='Choose File']")
	public static WebElement choosefile1;

	@FindBy(xpath = "(//*[contains(text(),' Initiate Process ')])[1]")
	public static WebElement intiprocess1;

	@FindBy(xpath = "//*[@id='newInvoicesContainer']/div/div/div/div[2]/div[1]/div[2]/button/span[1]/img")
	public static WebElement reqlogs1;

	@FindBy(xpath = "(//*[contains(@title,'Notifications')])[1]")
	public static WebElement clickview;

	@FindBy(xpath = "(//*[contains(text(),'refresh')])[3]")
	public static WebElement refresh;

	@FindBy(xpath = "(//*[contains(text(),'close')])[3]")
	public static WebElement cancel;

	@FindBy(xpath = "(//*[contains(text(),'visibility')])[5]")
	public static WebElement viewone;

	@FindBy(xpath = "(//*[contains(@title,'Request Completed')])[1]")
	public static WebElement reqpan;

	@FindBy(xpath = "(//*[contains(text(),'Document No')])[1]")
	public static WebElement panbill;

	@FindBy(xpath = "(//*[contains(text(),'visibility')])[5]")
	public static WebElement clickreq;

	@FindBy(xpath = "(//*[contains(text(),' arrow_drop_down ')])[1]")
	public static WebElement location;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Search Tenant')]")
	public static WebElement searchlocation;

	@FindBy(xpath = "(//*[contains(text(),'proqa  |  proqalocation1')])[1]")
	public static WebElement locnavigate;

	@FindBy(xpath = "(//*[contains(text(),'arrow_drop_down')])[2]")
	public static WebElement menustate;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Search App')]")
	public static WebElement searchapp2;

	@FindBy(xpath = "(//*[contains(text(),'EWB-Statewide')])")
	public static WebElement selectstateapp;

	@FindBy(xpath = "//*[@id='newInvoicesContainer']/div/div/div/div[2]/div[1]/div[2]/button/span[1]/img")
	public static WebElement reqlogs2;

	@FindBy(xpath = "//*[contains(text(),'close')]")
	public static WebElement reqclose;

	@FindBy(xpath = "(//*[contains(text(),'Document No')])[1]")
	public static WebElement Statedocument;

	@FindBy(xpath = "(//*[contains(text(),'arrow_drop_down ')])[1]")
	public static WebElement location3;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Search Tenant')]")
	public static WebElement searchloc3;

	@FindBy(xpath = "(//*[contains(text(),'proqa  |  proqalocation1  |  subloc ')])[1]")
	public static WebElement selectlocation3;

	@FindBy(xpath = "//*[contains(text(),'Outward E-Way Bills')]")
	public static WebElement selectoutapp;

	@FindBy(xpath = "//*[contains(@title,'Request Logs')]")
	public static WebElement reqlog3;

	@FindBy(xpath = "(//*[contains(@title,'View')])[2]")
	public static WebElement view1;

	@FindBy(xpath = "//*[contains(@class,'col-6 no-padding feedValue')]")
	public static WebElement billno;

	@FindBy(xpath = "//*[contains(@title,'Refresh Results')]")
	public static WebElement refreshresult;

	@FindBy(xpath = "(//*[contains(@class,'invoiceFeedItem_details row')])[1]")
	public static WebElement row;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/mat-dialog-container/mat-dialog-content/div/eninvoice-table/div/table/tbody/tr[1]/td[4]/span")
	public static WebElement timestamp;

	public PanIndiaPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public void verifypanindia() throws InterruptedException, AWTException {
		Thread.sleep(5000);
		action.JSClick(getDriver(), Appmenu1);
		Thread.sleep(3000);
		action.type(searchapp1, properties.getProperty("app2"));
		Thread.sleep(3000);
		action.JSClick(getDriver(), Selapp1);
		Thread.sleep(2000);
		action.JSClick(getDriver(), menu1);
		Thread.sleep(2000);
		action.JSClick(getDriver(), createnew1);
		Thread.sleep(2000);
		action.JSClick(getDriver(), Selecttransone);
		Thread.sleep(2000);
		action.type(search1, properties.getProperty("searchapp1"));
		Thread.sleep(2000);
		action.JSClick(getDriver(), seletrans1);
		action.explicitWait(getDriver(), choosefile1, 30);

		action.JSClick(getDriver(), choosefile1);
		Thread.sleep(5000);
		action.uploadFile(properties.getProperty("filepath1"));
		Thread.sleep(2000);
		action.JSClick(getDriver(), intiprocess1);
		Thread.sleep(2000);
		action.JSClick(getDriver(), reqlogs1);
		Thread.sleep(2000);
		action.JSClick(getDriver(), clickview);
		Thread.sleep(2000);
		action.JSClick(getDriver(), refresh);
		Thread.sleep(2000);
		action.JSClick(getDriver(), cancel);
		action.explicitWait(getDriver(), choosefile1, 30);
		//Thread.sleep(5000);
		String actualstate = reqpan.getText();
		AssertJUnit.assertEquals(actualstate, "Request Completed");
		Thread.sleep(5000);
        action.JSClick(getDriver(), clickreq);
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		action.JSClick(getDriver(), location);
		Thread.sleep(5000);
		action.type(searchlocation, properties.getProperty("sealoc"));
		Thread.sleep(5000);
		action.JSClick(getDriver(), locnavigate);
		Thread.sleep(3000);
		action.JSClick(getDriver(), selectstateapp);
		Thread.sleep(3000);
		action.JSClick(getDriver(), reqlogs2);
		Thread.sleep(3000);
		action.JSClick(getDriver(), reqclose);
		Thread.sleep(3000);
		action.JSClick(getDriver(), location3);
		Thread.sleep(3000);
		action.type(searchloc3, properties.getProperty("sealoc1"));
		Thread.sleep(3000);
		action.JSClick(getDriver(), selectlocation3);
		Thread.sleep(3000);
		action.JSClick(getDriver(), selectoutapp);
		Thread.sleep(3000);
		action.JSClick(getDriver(), reqlog3);
		Thread.sleep(3000);
		String typevalue1 = timestamp.getAttribute("title");
		System.out.print("Tmestamp    :" + typevalue1);
		System.out.print("\n");
		Thread.sleep(3000);
		action.JSClick(getDriver(), view1);
		Thread.sleep(3000);
		action.JSClick(getDriver(), refreshresult);
		Thread.sleep(3000);
		action.JSClick(getDriver(), row);
		Thread.sleep(1000);
		String value = billno.getAttribute("title");
		System.out.println("Eway Bill Number :" + value);
		System.out.print("\n");
		
		
	}
}
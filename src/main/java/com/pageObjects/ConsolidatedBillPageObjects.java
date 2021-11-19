package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.app.actiondriver.Action;
import com.app.base.BaseClass;

public class ConsolidatedBillPageObjects extends BaseClass {

	Action action = new Action();

	@FindBy(xpath = "//*[contains(@title,'Refresh Results')]")
	public static WebElement refresh1;

	@FindBy(xpath = "(//*[contains(@class,'feedMainDiv')])[1]")
	public static WebElement feedcol;

	@FindBy(xpath = "//*[contains(@title,'More Actions')]")
	public static WebElement bulkactions;

	@FindBy(xpath = "//*[contains(text(),'Consolidate')]")
	public static WebElement conclik;

	@FindBy(xpath = "//*[contains(@title,'Search by Vehicle Number')]")
	public static WebElement vehno;

	@FindBy(xpath = "(//*[contains(text(),'Search')])[2]")
	public static WebElement search1;

	@FindBy(xpath = "//*[contains(text(),' Select All ')]")
	public static WebElement select1;

	@FindBy(xpath = "//*[contains(text(),'Consolidate Now')]")
	public static WebElement clikconsolidate;

	@FindBy(xpath = "//*[contains(@placeholder,'Select State')]")
	public static WebElement dropdown;

	@FindBy(xpath = "//*[contains(text(),'Telangana')]")
	public static WebElement selstate;

	@FindBy(xpath = "//*[contains(@data-placeholder,'Ship From Place')]")
	public static WebElement selplace;

	@FindBy(xpath = "(//span[contains(text(),'Consolidate')])[4]")
	public static WebElement button;

	@FindBy(xpath = "(//*[contains(text(),'Close')])")
	public static WebElement close1;

	public ConsolidatedBillPageObjects() {
		PageFactory.initElements(getDriver(), this);
	}

	public void verifyconsolewaybill() throws InterruptedException {
		Thread.sleep(3000);
		refresh1.click();
		Thread.sleep(3000);
		action.JSClick(getDriver(), bulkactions);
		Thread.sleep(3000);
		action.JSClick(getDriver(), conclik);
		Thread.sleep(3000);
		action.type(vehno, properties.getProperty("vehicleno"));
		Thread.sleep(3000);
		action.JSClick(getDriver(), search1);
		Thread.sleep(3000);
		action.JSClick(getDriver(), select1);
		Thread.sleep(3000);
		action.JSClick(getDriver(), clikconsolidate);
		Thread.sleep(3000);
		dropdown.click();
		Thread.sleep(3000);
		action.JSClick(getDriver(), selstate);
		Thread.sleep(3000);
		action.type(selplace, properties.getProperty("shipplace"));
		Thread.sleep(3000);
		action.JSClick(getDriver(), button);
		Thread.sleep(3000);
		action.JSClick(getDriver(), close1);

	}

}

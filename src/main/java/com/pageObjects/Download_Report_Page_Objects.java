package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Download_Report_Page_Objects {
	
	
	
	
	
	@FindBy(xpath="//span[@id='mat-calendar-button-1']")
	public static WebElement datepic;
	
	
	@FindBy(xpath="//i[@title='More Actions']")
	public static WebElement moreActions;
	
	@FindBy(xpath="//button[normalize-space()='Download Report']")
	public static WebElement downreport;
	
	
	@FindBy(xpath="(//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted'])[1]")
	public static WebElement seldtpick;
	
	@FindBy(xpath="(//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted'])[2]")
	public static WebElement seldtpick2;

	@FindBy(xpath="(//*[@id='mat-calendar-button-1'])")
	public static WebElement calbutton;
	
	@FindBy(xpath="//button[@aria-label='Choose month and year']")
	public static WebElement monyear;
	
	@FindBy(xpath="//button[@aria-label='Previous month']")
	public static WebElement premonth;
	
	@FindBy(xpath="//body[1]/div[3]/div[4]/div[1]/mat-dialog-container[1]/mat-datepicker-content[1]/div[2]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr/td/div[contains(text(),'20')]")
	public static WebElement seldate;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//*[contains(@class,'reportsLink')]")
	public static WebElement replink;
	
	@FindBy(xpath="//*[contains(text(),'Select Extension')]")
	public static WebElement selext;
	
	@FindBy(xpath="//*[contains(text(),' Conslidated XSLX Report ')]")
	public static WebElement conxslxreport;
	
	@FindBy(xpath="//*[contains(text(),'Download Reports')]")
	public static WebElement reports;
	
	@FindBy(xpath="(//*[contains(text(),'close')])[2]")
	public static WebElement close;
	
	
	//Download Error Report
	@FindBy(xpath="//i[@title='More Actions']")
	public static WebElement moreActions1;
	
	@FindBy(xpath="//button[normalize-space()='Download Error Report']")
	public static WebElement downerrreport;

	@FindBy(xpath="(//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted'])[1]")
	public static WebElement seldtpick1;
	
	@FindBy(xpath="(//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted'])[2]")
	public static WebElement seldtpick3;

	@FindBy(xpath="(//*[@id='mat-calendar-button-1'])")
	public static WebElement calbutton1;
	
	@FindBy(xpath="//button[@aria-label='Choose month and year']")
	public static WebElement monyear1;
	
	@FindBy(xpath="//button[@aria-label='Previous month']")
	public static WebElement premonth1;
	
	@FindBy(xpath="//body[1]/div[3]/div[4]/div[1]/mat-dialog-container[1]/mat-datepicker-content[1]/div[2]/mat-calendar[1]/div[1]/mat-month-view[1]/table[1]/tbody[1]/tr/td/div[contains(text(),'20')]")
	public static WebElement seldate1;
	
	@FindBy(xpath="//input[@id='errorRecipient']")
	public static WebElement errRep;
	
	@FindBy(xpath="//span[normalize-space()='Submit']")
	public static WebElement sub;
	
	
	//Json download
	
	
    @FindBy(xpath="//label[@for='mat-checkbox-2-input']//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']")
	public static WebElement chkbox;
    
    
	
	@FindBy(xpath="//button[normalize-space()='JSON Download']")
	public static WebElement Jd;
	
	
	
	
	
}

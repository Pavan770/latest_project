package com.pageObjects;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Notify_Partners_Page_Objects {
	
	
	@FindBy(xpath="(//*[contains(text(),'arrow_drop_down')])[2]")
	public static WebElement selectdrop;
	
	@FindBy(xpath="(//*[contains(@data-placeholder,'Search App')])")
	public static WebElement selApp;
	
	@FindBy(xpath="(//*[contains(@title,'Outward E-Way Bills')])")
	public static WebElement selout;
	
	@FindBy(xpath="(//*[contains(@class,'invoiceFeedItem_details row')])[1]")
	public static WebElement feedcol;
	
	@FindBy(xpath="//div[normalize-space()='Notify Partners']")
	public static WebElement notipartner;
	
	@FindBy(xpath="//span[normalize-space()='Notify Partner']")
	public static WebElement notipartner1;
	
	@FindBy(xpath="//*[contains(@data-placeholder,'First Name')]")
	public static WebElement firstname;
	
	@FindBy(xpath="//*[contains(@data-placeholder,'Last Name')]")
	public static WebElement lastname;
	
	@FindBy(xpath="//*[contains(@data-placeholder,'Email')]")
	public static WebElement email;
	
	@FindBy(xpath="(//*[contains(text(),'Type')])[3]")
	public static WebElement type;
	
	@FindBy(xpath="//*[contains(text(),' Consignee ')]")
	public static WebElement consignee;
	
	@FindBy(xpath="(//*[contains(text(),'Notify')])[4]")
	public static WebElement noity;
	
	 @FindBy(xpath="//*[contains(@title,'Refresh Results')]")
	 public static WebElement refresh1;
	 
	 @FindBy(xpath="//*[contains(@class,'mat-simple-snackbar ng-star-inserted')]")
	 public static WebElement loadingIcon;
	 
	 @FindBy(xpath="//*[contains(@title,'Close')]")
	 public static WebElement close;
	
	@FindBy(xpath="//i[@title='Click here to get latest data']")
	public static WebElement refresh2;

}

package com.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragandDrop_page_Objects {
	
	@FindBy(xpath="(//*[contains(text(),' arrow_drop_down ')])[2]")
	public static WebElement selectapp;
	
	@FindBy(xpath="(//*[contains(@data-placeholder,'Search App')])[2]")
	public static WebElement appsearch;
	
	@FindBy(xpath="(//*[contains(text(),'testingfileupload')])")
	public static WebElement selapp;
	
	@FindBy(xpath="(//*[contains(text(),'Process Now ')])")
	public static WebElement processnow;
	
	@FindBy(xpath="//*[contains(text(),'File Upload')]")
	public static WebElement upload;
    
	@FindBy(xpath="(//*[contains(text(),'Select Transformation')])")
	public static WebElement seltrans;
	
	@FindBy(xpath="//*[contains(text(),' Testing Inbound Transformations ')]")
	public static WebElement sel;
}

package com.app.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

import com.app.base.BaseClass;
import com.app.dataprovider.DataProviders;
import com.app.utility.Log;
import com.pageObjects.EwayBillPageObjects;

public class EwayBillPageTest extends BaseClass {

	private EwayBillPageObjects ewaybillpageobjects;
	

/*	@Parameters("browser")
	@BeforeMethod(groups = { "Smoke", "Sanity", "Regression" })
	public void setup(String browser) {
		launchBrowser(browser);
	}
*/
	
	/*@AfterMethod(groups = {"Smoke","Sanity","Regression"})
	public void teardown() {
		getDriver().quit();
	}*/


	@Test(groups = {"Smoke","Sanity"})
	public void EwayBillTest() throws Throwable {
	    Log.startTestCase("EwaybillTest");
		ewaybillpageobjects = new EwayBillPageObjects();
		ewaybillpageobjects.ewayBills();
		/*if(ewaybillpageobjects.choosefile.isDisplayed()) {
			assertTrue(true, "File Uploaded");
		}else {
			assertTrue(false, "File not Uploaded");
		}*/
		Log.endTestCase("EwaybillTest");
	}

}


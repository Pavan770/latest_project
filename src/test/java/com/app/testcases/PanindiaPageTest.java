package com.app.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.app.base.BaseClass;
import com.pageObjects.PanIndiaPageObjects;

public class PanindiaPageTest extends BaseClass {
	private PanIndiaPageObjects panindiapageobjects;

	@Test(groups = { "Smoke", "Sanity" })
	public void panindiaTest() throws Throwable {
	//	Log.startTestCase("EwaybillTest");
		panindiapageobjects = new PanIndiaPageObjects();
		panindiapageobjects.verifypanindia();
		if(panindiapageobjects.choosefile1.isDisplayed()) {
			assertTrue(true, "File Uploaded");
		}else {
			assertTrue(false, "File not Uploaded");
		}
	//	Log.endTestCase("EwaybillTest");
	}

}

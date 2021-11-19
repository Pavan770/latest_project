package com.app.testcases;

import org.testng.annotations.Test;

import com.app.base.BaseClass;
import com.app.utility.Log;
import com.pageObjects.ConsolidatedBillPageObjects;

public class ConsolewaybillTest extends BaseClass {
	
	private ConsolidatedBillPageObjects consolidatedbillPageobjects;

	@Test(groups = {"Smoke","Sanity"})
	public void ConsolidatedEwayBillTest() throws Throwable {
	    Log.startTestCase("EwaybillTest");
		consolidatedbillPageobjects = new ConsolidatedBillPageObjects();
		consolidatedbillPageobjects.verifyconsolewaybill();
		Log.endTestCase("EwaybillTest");
	}

}

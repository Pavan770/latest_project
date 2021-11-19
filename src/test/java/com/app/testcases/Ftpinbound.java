package com.app.testcases;

import org.testng.annotations.Test;

import com.app.base.BaseClass;
import com.app.utility.Log;
import com.pageObjects.AppIntegrationpage;

public class Ftpinbound extends BaseClass {
	private AppIntegrationpage appintegrationpage;

	
	@Test(groups = { "Smoke", "Sanity" })
	public void FTPboundTest() throws Throwable {

		Log.startTestCase("FTPinboundTest");
		testcase = extentReport.createTest("verify FTP inbound Test case");
		testcase.info("Ftp inbound successfully");

		appintegrationpage = new AppIntegrationpage();
		appintegrationpage.AppIntegrationcreation();

		Log.endTestCase("FTPinboundTest");

	}

}

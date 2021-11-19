package com.app.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;
import com.app.base.BaseClass;
import com.app.dataprovider.DataProviders;
import com.pageObjects.EwayBillPageObjects;
import com.pageObjects.LocationsPageObjects;
import com.pageObjects.LoginPageObjects;

public class LoginPageTest extends BaseClass {

	private EwayBillPageObjects ewaybillpo;
	private LoginPageObjects loginPageObjects;
	private LocationsPageObjects locationspage;
	static Logger logger = Logger.getLogger(LoginPageTest.class);

	@Test(groups = { "Smoke", "Sanity" }, dataProvider = "credentials", dataProviderClass = DataProviders.class)
	public void loginTest(String uname, String pswd, String SQ1, String SQ2) throws Throwable {
		logger.info("Logging in to the application");
		testcase = extentReport.createTest("Verify Login Testcase");
		testcase.info("Login successfully");
		loginPageObjects = new LoginPageObjects();
	//	ewaybillpo = loginPageObjects.login(uname, pswd, SQ1, SQ2, ewaybillpo);
		locationspage = loginPageObjects.login(uname, pswd, SQ1, SQ2, locationspage);

	}
}

package com.app.testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.app.base.BaseClass;
import com.app.dataprovider.DataProviders;
import com.app.utility.Log;
import com.pageObjects.LocationsPageObjects;

public class LocationcreationTest extends BaseClass {
	//private LoginPageObjects loginpage;
	private LocationsPageObjects locationpage;
	
	
	@Test(groups = { "Smoke", "Sanity" }, dataProvider = "locationdetails", dataProviderClass = DataProviders.class)
	public void locationCreationTest(HashMap<String, String> hashMapValue) throws Throwable{
		
	Log.startTestCase("LocationCreationTest");
	testcase = extentReport.createTest("Verify Location Testcase");
	testcase.info("location successfully");
	locationpage = new LocationsPageObjects();
	locationpage.locationcreation1();
	locationpage.locationcreation(hashMapValue.get("LocationName"),
			hashMapValue.get("FirstName"),
			hashMapValue.get("LastName"),
			hashMapValue.get("UserId"),
			hashMapValue.get("EmailId"),
			hashMapValue.get("Addline1"),
			hashMapValue.get("Selectcountry"),
			hashMapValue.get("Selectstate"),
			hashMapValue.get("Selectcity"),
			hashMapValue.get("pincode"),
			hashMapValue.get("Corporateemailid"));
	  Log.endTestCase("locationCreationTest");
		
	}

}

package com.app.testcases;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.app.base.BaseClass;
import com.app.dataprovider.DataProviders;
import com.app.utility.Log;
import com.pageObjects.GlobalIntegrationPage;

public class GlobalIntegraTest extends BaseClass {
	private GlobalIntegrationPage globalintegrapage;
	
	
	
	@Test(groups = { "Smoke", "Sanity" }, dataProvider = "globalintegration", dataProviderClass = DataProviders.class)
	public void globalIntegraTest(HashMap<String, String> hashMapValue) throws Throwable{
		
		Log.startTestCase("GlobalintegraCreationTest");
		testcase = extentReport.createTest("Verify GlobalintegraCreation Testcase");
		testcase.info("GlobalintegraCreation successfully");
		
		globalintegrapage = new GlobalIntegrationPage();
		globalintegrapage.Globalintcreation(hashMapValue.get("Name"),
				hashMapValue.get("ServerAddress"),
		        hashMapValue.get("Port"),
		        hashMapValue.get("FolderPath"),
		        hashMapValue.get("UserName"),
		        hashMapValue.get("Encryptedkey"));
		Log.endTestCase("GlobalingraCreationTest");
		
		
		
		
		
		
	}

}

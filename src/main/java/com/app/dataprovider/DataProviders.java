
package com.app.dataprovider;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

import com.app.utility.NewExcelLibrary;

public class DataProviders {
	public static NewExcelLibrary obj;
	

	  

//Class --> LoginPageTest,HomePageTest Test Case--> loginTest

	@DataProvider(name = "credentials")
	public static  Object[][] getCredentials() {
		  obj = new NewExcelLibrary();
		// Totals rows count
		int rows = obj.getRowCount("Credentials");
		// Total Columns
		int column = obj.getColumnCount("Credentials");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Credentials", j, i + 2);
			}
		}
		return data;
	}
	
	
	@DataProvider(name = "locationdetails")
	public static Object[][] accountCreation() {
		 obj = new NewExcelLibrary();
		// Totals rows count
		int rows = obj.getRowCount("Locationdetails");
		// Total Columns
		int column = obj.getColumnCount("Locationdetails");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Locationdetails", j, 1),
						obj.getCellData("Locationdetails", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	
	@DataProvider(name = "globalintegration")
	public static Object[][] globalintegration() {
		 obj = new NewExcelLibrary();
		// Totals rows count
		int rows = obj.getRowCount("Globalintegration");
		// Total Columns
		int column = obj.getColumnCount("Globalintegration");
		int actRows = rows - 1;
		//Created an object of array to store data
		Object[][] data = new Object[actRows][1];
		
		for (int i = 0; i < actRows; i++) {
			Map<String, String> hashMap = new HashMap<>();
			for (int j = 0; j < column; j++) {
				hashMap.put(obj.getCellData("Globalintegration", j, 1),
						obj.getCellData("Globalintegration", j, i + 2));
			}
			data[i][0]=hashMap;
		}
		return data;
	}
	
	
	/*@DataProvider(name = "Ewaybill")
	public static  Object[][] getEwaybill() {
		  obj = new NewExcelLibrary();
		// Totals rows count
		int rows = obj.getRowCount("Ewaybill");
		// Total Columns
		int column = obj.getColumnCount("Ewaybill");
		int actRows = rows - 1;

		Object[][] data = new Object[actRows][column];

		for (int i = 0; i < actRows; i++) {
			for (int j = 0; j < column; j++) {
				data[i][j] = obj.getCellData("Ewaybill", j, i + 2);
			}
		}
		return data;
	}
*/
}

package com.app.testcases;

import java.util.Random;

import org.testng.annotations.Test;

import com.app.utility.ExcelApiTest;

public class WriteExcelDatautils {
    @Test
	public void inRandoutward() throws Throwable {

		Random r = new Random();
		ExcelApiTest eat = new ExcelApiTest("D:\\Framework\\latest_project\\InputFile\\05AAACG2115R1ZN.xlsx");
		// eat.setCellData("Credentials", 4, 1, "Pass");

		eat.setCellData("EWB Input Data", "Document No", 2, "inv" + r.nextInt());
		eat.setCellData("EWB Input Data", "Document No", 3, "inv" + r.nextInt());
		System.out.println("celldata is printed in excel sheet");
		System.out.println(eat.setCellData("EWB Input Data", "Document No", 2, "inv" + r.nextInt()));

	}
    
    
    @Test
  	public void inRandpanindia() throws Throwable {

  		Random r = new Random();
  		ExcelApiTest eat = new ExcelApiTest("D:\\Framework\\latest_project\\InputFile\\05AAACG2115R1ZN_Panindia.xlsx");
  		// eat.setCellData("Credentials", 4, 1, "Pass");

  		eat.setCellData("EWB Input Data", "Document No", 2, "inv" + r.nextInt());
  		eat.setCellData("EWB Input Data", "Document No", 3, "inv" + r.nextInt());
  		System.out.println("celldata is printed in excel sheet");
  		System.out.println(eat.setCellData("EWB Input Data", "Document No", 2, "inv" + r.nextInt()));

  	}

}

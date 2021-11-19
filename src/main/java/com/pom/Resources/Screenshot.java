package com.pom.Resources;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.app.base.BaseClass;

public interface Screenshot {

	public static String takescreenshot() throws IOException {
     
		TakesScreenshot takesScreenshot = (TakesScreenshot) BaseClass.getDriver();
		File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String screenshotpath="D:/Framework/latest_project/Screenshots/"+BaseClass.getTcname()+getCurrentDateTime()+".jpeg";

		FileUtils.copyFile(file, new File(screenshotpath));
		return screenshotpath;
	}

	public static String Takescreenshotone(String tcName) throws IOException {

		TakesScreenshot takescreenshot = (TakesScreenshot) BaseClass.getDriver();
		File file = takescreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"D:/Framework/latest_project/Screenshots/"+BaseClass.getTcname()+".jpeg"));
		return tcName;

	}

	
	
	public static String getCurrentDateTime() {
		DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate = new Date();
		return customFormat.format(currentDate);
	}
}
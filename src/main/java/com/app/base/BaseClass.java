package com.app.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.pom.Resources.Screenshot;

@Listeners(com.pom.listeners.ListenerTest.class)
public class BaseClass {

	public static String tcname;
	public static WebDriver driver = null;
	public static Properties properties = null;
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testcase;
	// public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	Logger logger = Logger.getLogger(BaseClass.class);

	// property file load . return
	public Properties loadPropertyFile() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Framework\\latest_project\\Configuration\\config.properties");
		properties = new Properties();
		properties.load(fis);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {

		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter(
				"D:/Framework/latest_project/Reports/ExtentReport" + Screenshot.getCurrentDateTime() + ".html");
		extentReport.attachReporter(htmlReporter);

		PropertyConfigurator.configure("log4j.properties");
		logger.info("Taxilla application Test Begins");
		logger.info("Loading the property file");
		loadPropertyFile();

		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverlocation = properties.getProperty("DriverLocation");

		if (browser.equalsIgnoreCase("chrome")) {
			logger.info("Launching Chrome");
			System.setProperty("webdriver.chrome.driver", driverlocation);
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {
			logger.info("Launching Firefox");
			System.setProperty("webdriver.gecko.driver", driverlocation);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("ie")) {

			System.setProperty("webdriver.ie.driver", driverlocation);
			driver = new InternetExplorerDriver();
		}
		getDriver().manage().window().maximize();
		getDriver().manage().deleteAllCookies();

		logger.info("navigating to Application");
		getDriver().get(url);
		getDriver().manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static String getTcname() {
		return tcname;
	}

	@BeforeMethod
	public void beforeTCEXECUtion(Method method) {

		tcname = method.getName();
		System.out.println("CURRENTLY Executing TC IS: " + tcname);
	}

	@AfterMethod
	public String beforeTCExecution(ITestResult result) throws IOException {

		String tcName = result.getName();
		if (result.getStatus() == ITestResult.SUCCESS) {
			System.out.println("TC is passed: " + tcName);
			testcase.pass("Test passed:",
					MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.takescreenshot()).build());
		} else if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("TC is Failed: " + tcName);
			System.out.println("TC EXCEPTION IS:" + result.getThrowable());
			Screenshot.Takescreenshotone(tcName);
			testcase.fail("Test Failed:",
					MediaEntityBuilder.createScreenCaptureFromPath(Screenshot.takescreenshot()).build());
		} else if (result.getStatus() == ITestResult.SKIP) {
			System.out.println("TC SKIPPED IS: " + result.getThrowable());
			System.out.println("TC IS SKIPPED: " + tcName);
			Screenshot.Takescreenshotone(tcName);
		}
		return tcName;
	}

	// securtyone
	public boolean onefactorauth(WebElement ele, String text) {

		String test1 = "What is most famous landmark near to your home?";
		String test2 = "What is the first name of your grandmother?";
		String test3 = "Last four digits of your father phone number?";
		String test4 = "In which city you are born?";
		String test5 = "What is your mother maiden name?";
		String test6 = "What is your preferred brand of Soft Drink?";

		if (test1.contains("famous") || test2.contains("grandmother?") || test3.contains("father")
				|| test4.contains("born?") || test5.contains("maiden") || test6.contains("Drink?")) {

			boolean flag = false;
			try {
				flag = ele.isDisplayed();
				ele.clear();
				ele.sendKeys(text);
				// logger.info("Entered text :"+text);
				flag = true;
			} catch (Exception e) {
				System.out.println("Location Not found");
				flag = false;
			} finally {
				if (flag) {
					System.out.println("Successfully entered value");
				} else {
					System.out.println("Unable to enter value");
				}

			}
			return flag;
		}
		return false;
	}

	// securitytwo
	public boolean twofactorauth(WebElement ele, String text) {

		String test1 = "What is most famous landmark near to your home?";
		String test2 = "What is the first name of your grandmother?";
		String test3 = "Last four digits of your father phone number?";
		String test4 = "In which city you are born?";
		String test5 = "What is your mother maiden name?";
		String test6 = "What is your preferred brand of Soft Drink?";

		if (test1.contains("famous") || test2.contains("grandmother?") || test3.contains("father")
				|| test4.contains("born?") || test5.contains("maiden") || test6.contains("Drink?")) {

			boolean flag = false;
			try {
				flag = ele.isDisplayed();
				ele.clear();
				ele.sendKeys(text);
				// logger.info("Entered text :"+text);
				flag = true;
			} catch (Exception e) {
				System.out.println("Location Not found");
				flag = false;
			} finally {
				if (flag) {
					System.out.println("Successfully entered value");
				} else {
					System.out.println("Unable to enter value");
				}

			}
			return flag;
		}
		return false;
	}

	@AfterSuite
	public void tearDown() {
		logger.info("Execution done. Closing the browser");
		// driver.quit();
		extentReport.flush();
	}

}

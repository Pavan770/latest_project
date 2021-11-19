package com.pom.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.pom.Resources.Screenshot;

public class ListenerTest  implements ITestListener						
{
	String tcName=null;

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
		System.out.println("SUITE EXECUTION IS COMPLETED");
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("SUITE EXECUTION IS STARTED");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try{
			tcName = result.getName();
			Screenshot.Takescreenshotone(tcName);
		}catch (Exception e) {
			e.printStackTrace();
		}
	

   // System.out.println("TestCases Failed and Testcase Details are "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		try{
			
			Screenshot.Takescreenshotone(tcName);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	//System.out.println("TestCases Skipped and Testcase Details are "+result.getName());
		
	}

	@Override
	public void onTestStart(ITestResult result) {
    System.out.println("TestCase  Started and Testcase Details are "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
    System.out.println("TestCase Success and  Testcase Details are "+result.getName());
		
	}

 }		
	

package com.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEx implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcase started with name: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("testcase successed with name: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("testcase failed with name: "+result.getName());
		DemoTest.getScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcase skipped with name: "+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("testcase failed but within Success Percentage: "+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("testcase failed with Timeout: "+result.getName());
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("testcase Context: "+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		ITestListener.super.onFinish(context);
	}
	
	

}

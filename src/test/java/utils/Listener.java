package utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Initiate.InitiateTest;
import Reporting.ReportingClass;

public class Listener implements ITestListener{
	
	private static String getTestMethodName(ITestResult iTestResult) {
        return iTestResult.getMethod().getConstructorOrMethod().getName();
    }
	
	@Override
    public void onStart(ITestContext iTestContext) {
        //System.out.println("I am in onStart method " + iTestContext.getName());
        iTestContext.setAttribute("WebDriver", InitiateTest.driver);
    }
	
	
	@Override
    public void onFinish(ITestContext iTestContext) {
        //System.out.println("I am in onFinish method " + iTestContext.getName());
    }
	
	@Override
    public void onTestStart(ITestResult iTestResult) {
        //System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
        ReportingClass.initReports(getTestMethodName(iTestResult));
    }
	
	@Override
    public void onTestSuccess(ITestResult iTestResult) {
        //System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
        //ExtentReports log operation for passed tests.
        ReportingClass.infoLogPass(getTestMethodName(iTestResult));
    }
	

	@Override
    public void onTestFailure(ITestResult iTestResult) {
        //System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
 
        try {
			ReportingClass.reportFailure("Title is failed "+getTestMethodName(iTestResult), InitiateTest.driver);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		ReportingClass.infoLogMessage("Skipped "+getTestMethodName(iTestResult));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	

	
}

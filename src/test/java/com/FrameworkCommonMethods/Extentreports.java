package com.FrameworkCommonMethods;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreports extends ScreenShots{
	
	/*Author: Swati
	 * Date: 23-01-2020
	 * Description: Class for extent reports
	 */
	public static ExtentReports reportgeneration;
	public static ExtentTest logger;

	@BeforeSuite
	public static void reportgeneration()
	{
		ExtentHtmlReporter extentreportformat=new ExtentHtmlReporter("F:\\selenium oxy\\HRM\\Reports\\HTML_"+getsysdate()+".html");
		reportgeneration=new ExtentReports();
		reportgeneration.attachReporter(extentreportformat);
	}
	
	@AfterMethod
	public static void screenshotattachreport(ITestResult result) throws IOException {
		Reporter.log("Attach screenshot");
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.pass("Sucess", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot()).build());
			Reporter.log("All pass screen shots is attached");
		}
		else if(result.getStatus()==ITestResult.FAILURE)
		{
			logger.fail("Failure", MediaEntityBuilder.createScreenCaptureFromPath(getscreenshot()).build());
			Reporter.log("All fail screen shots is attached");
		}
		else
		{
			System.out.println("Unable to attach screen shots");
		}
		reportgeneration.flush();
		Reporter.log("HTML reports are generated. Please check Reports folder", true);
	}
	
	
		
	
}

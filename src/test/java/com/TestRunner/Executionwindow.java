package com.TestRunner;


import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FrameworkCommonMethods.BaseClass;
import com.FrameworkCommonMethods.Extentreports;
import com.TestCases.WebUI;

public class Executionwindow extends Extentreports{

	/*Author: Swati
	 * Date: 22-01-2020
	 * Description: Execute test cases
	 */


	@Test(priority=0)
	public static void LaunchBrowser() throws InterruptedException, IOException {

		logger=reportgeneration.createTest("Launch browser");
		try {
			WebUI testcases=PageFactory.initElements(driver, WebUI.class);

			getBrowser("Chrome");
			logger.pass("Browser is launched successfully");
		} catch (Exception e) {
			logger.fail("Browser is not launched successfully"+e.getMessage());
		}
	}
		//getscreenshot();
		

		@Test(priority=1)
		public static void UserLogin() {
		logger=reportgeneration.createTest("User Login");
		try {
			WebUI testcases=PageFactory.initElements(driver, WebUI.class);
			testcases.hrmlogin();
			logger.pass("Login is successfull");
		} catch (Exception e) {
			logger.fail("Login is unsuccessfull"+e.getMessage());
		}
		}

		@Test(priority=2)
		public static void applyLeave() {
	
		
		logger=reportgeneration.createTest("Apply  Leave");
		try {
			WebUI testcases=PageFactory.initElements(driver, WebUI.class);

			testcases.applyleave();
			logger.pass("Apply leave is successfull");
		} catch (Exception e) {
			logger.fail("Apply leave is unsuccessfull"+e.getMessage());
		}

	}
}

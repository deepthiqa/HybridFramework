package com.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.FrameworkCommonMethods.ScreenShots;
import com.FrameworkCommonMethods.TestdataReader;
import com.WebCommonMethods.Webmethods;

public class WebUI extends ScreenShots{

	/*Author: Swati
	 * Date: 22-01-2020
	 * Description: WebUI methods
	 */
	public static TestdataReader tdr=new TestdataReader();
	public static Webmethods webmethods=new Webmethods();
	//public static ScreenShots scrshots=new ScreenShots();
	//Login to page objects

	@FindBy(xpath="//input[@name='txtUsername']") public static WebElement userelement;
	@FindBy(id="txtPassword") public static WebElement passwordelement;
	@FindBy(id="btnLogin") public static WebElement loginbutton;

	//Apply leave
	@FindBy(id="menu_leave_viewLeaveModule")public static WebElement leavetab;
	@FindBy(id="menu_leave_applyLeave")public static WebElement applyleavelink;
	//=======================

	public static void hrmlogin() throws IOException
	{

		String username=tdr.getcelldata("Login", 1, 1);
		String password=tdr.getcelldata("Login", 1, 2);

		userelement.sendKeys(username);
		passwordelement.sendKeys(password);
		loginbutton.click();
		getscreenshot();


	}
	public static void applyleave() throws IOException
	{
		webmethods.mousehover(leavetab);
		applyleavelink.click();
		getscreenshot();

	}
}
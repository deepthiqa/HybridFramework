package com.FrameworkCommonMethods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots extends BaseClass {
	/*Author: Swati
	 * Date: 22-01-2020
	 * Description: Class to take screenshot
	 */

	public static String getscreenshot() throws IOException
	{
		String screenshotpath="F:\\selenium oxy\\HRM\\Screenshots\\HRM_"+getsysdate()+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File(screenshotpath));
		return screenshotpath;

	}

	public static String getsysdate() {
		DateFormat df=new SimpleDateFormat ("MM-dd-yyyy_HH-mm-ss");
		Date currentdate=new Date();
		String systemtimeanddate=df.format(currentdate);
		System.out.println("systemtimeanddate: "+systemtimeanddate);

		return systemtimeanddate;

	}
}

package com.FrameworkCommonMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

public class BaseClass {

	public static WebDriver driver;
	/*Author: Swati
	 * Date: 21-01-2020
	 * Description: Invoke browser
	 */
	public static void getBrowser(String browser) throws InterruptedException

	{
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "F:\\selenium oxy\\SeleniumPractice\\Browsers\\chromedriver.exe");

			driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("http://testingmasters.com/hrm");

		}

		else if(browser.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "F:\\selenium oxy\\SeleniumPractice\\Browsers\\IEDriverServer.exe");

			driver=new InternetExplorerDriver();

			driver.manage().window().maximize();
			driver.get("http://testingmasters.com/hrm");

		}
		else if(browser.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", "F:\\selenium oxy\\SeleniumPractice\\Browsers\\geckodriver.exe");

			driver=new FirefoxDriver();

			driver.manage().window().maximize();
			driver.get("http://testingmasters.com/hrm");

		}
		else
		{
			System.out.println("Browser is undefined");
		}
	}
}

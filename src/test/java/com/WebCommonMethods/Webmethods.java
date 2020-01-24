package com.WebCommonMethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FrameworkCommonMethods.BaseClass;

public class Webmethods {
	/*Author: Swati
	 * Date: 22-01-2020
	 * Description: Webpage common methods
	 */
	
	public static void mousehover(WebElement element)
	{
		try {
			Actions act=new Actions(BaseClass.driver);
			act.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println("Mouve hover is not working: "+e.getMessage());
		}
		
	}
}

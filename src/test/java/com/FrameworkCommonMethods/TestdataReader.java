package com.FrameworkCommonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestdataReader {
	/*Author: Swati
	 * Date: 22-01-2020
	 * Description: Read test data from excel
	 */

	public static String getcelldata(String sheetname, int rownumber, int columnnumber) throws IOException {

		File filepath=new File("F:\\selenium oxy\\HRM\\TestData\\inputdata.xlsx");
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook xsw=new XSSFWorkbook(fis);
		XSSFSheet xss=xsw.getSheet(sheetname);

		String cellvalue=xss.getRow(rownumber).getCell(columnnumber).getStringCellValue();
		return cellvalue;
		
	}
}

package org.automation.signet.utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;



public class Utility {
	public WebDriver driver;
	
	public static Object fetchPropertyValue(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./Config/config.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key);
	

}
	public static String fetchLocatorValue(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("./Config/Elements.properties");
		Properties property=new Properties();
		property.load(file);
		return property.get(key).toString();
}
	
	
	}
	/*public static String fetchDataValue(String key) throws IOException
	{
		FileInputStream fs=new FileInputStream("C:\\Users\\33z01zi5\\Desktop\\TEST\\Automation\\TestData_excel\\TestData.xlsx");
		XSSFWorkbook wk=new XSSFWorkbook(fs);
		XSSFSheet s1=wk.getSheet("Sheet1");
		XSSFRow r1=s1.getRow(0);
		XSSFCell c1=r1.getCell(1);
	 String username = c1.getStringCellValue();
		return username;
	}*/
//	}

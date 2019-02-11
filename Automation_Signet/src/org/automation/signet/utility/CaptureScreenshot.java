package org.automation.signet.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot {
	public static void screenshots(WebDriver driver,String name) throws IOException
	{
	File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File f1=new File("./Screenshot/"+name+".png");
	FileUtils.copyFile(f, f1);
	}
}

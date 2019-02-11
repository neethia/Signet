package org.automation.signet.base;
import java.io.IOException;
import org.automation.signet.utility.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class DriverInstance {
	public WebDriver driver;
	public ExtentReports extentReport;
	public ExtentTest extentTest;
	@BeforeMethod

	public void initiateDriverInstance() throws IOException
	{
		extentReport = new ExtentReports("./Report/report.html",true);
		extentReport.addSystemInfo("Author Name", "Signet");

		if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(Utility.fetchPropertyValue("browserName").toString().equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver","./Driver/IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
			driver=new ChromeDriver();
		}
		driver.get(Utility.fetchPropertyValue("applicationURL").toString());
	}
	@AfterMethod
	public void closeDriverInstance()
	{
		
		extentReport.flush();
	    driver.quit();
	}
	@AfterSuite
	public void generateReport() throws Exception
	{

	}
	
	
}
	
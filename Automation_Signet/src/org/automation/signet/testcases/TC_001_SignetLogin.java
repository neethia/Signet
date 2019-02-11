package org.automation.signet.testcases;

//import java.io.File;
import java.io.IOException;


import org.automation.signet.base.DriverInstance;
import org.automation.signet.pages.LoginPage;
import org.automation.signet.utility.CaptureScreenshot;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class TC_001_SignetLogin extends DriverInstance {
	
	@Test
	public void tc_001_login() throws IOException, InterruptedException 
	{
		
			extentTest=extentReport.startTest("TC_001 : Login");
			LoginPage login=new LoginPage(driver);
			login.enterUsername("TESTSIGCSR2@bbaaviation.net");
			login.enterPassword("BHN84615!");
			login.clickSignin();
			Thread.sleep(2000);
		    CaptureScreenshot.screenshots(driver,"HomePage");
			extentTest.log(LogStatus.PASS, "Test Case Passed");
			extentReport.endTest(extentTest);
			

		
	}

}

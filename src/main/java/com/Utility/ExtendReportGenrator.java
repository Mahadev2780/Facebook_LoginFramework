package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtendReportGenrator {
	public static ExtentReports extent;
	
	public static ExtentReports getReports()
	{
		String reportpath="C:\\Users\\DELL\\eclipse-workspace\\Facebook_Login\\Report\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportpath);
		reporter.config().setDocumentTitle("Automation Report-Facebook");
		reporter.config().setReportName("Facebook System-AutoReport");
		reporter.config().setTheme(Theme.DARK);
		
	    extent= new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Facebook Login");
		extent.setSystemInfo("Version", "1.0.2");
		extent.setSystemInfo("Browser Name", "Chrome");
		extent.setSystemInfo("QA", "Mahadev Malge");
		return extent;
	}
	
	

}

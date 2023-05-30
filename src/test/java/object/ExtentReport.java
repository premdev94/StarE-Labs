package object;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
	static ExtentReports extent;
	
	public static ExtentReports getReportObject()
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter =new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Star E-Labs");
		
		 extent=new ExtentReports();
		 extent.attachReporter(reporter);
		 extent.setSystemInfo("Tester", "Prem");
		 extent.setSystemInfo("Application", "Star E-Labs");
		 //extent.setSystemInfo("Browser", "Chrome");
		 //extent.setSystemInfo("Reporting Manager", "Elango");
		 extent.setSystemInfo("Company Name", "Star Systems");
		 extent.setSystemInfo("Client", "VIT");
		 return extent;
	}

}
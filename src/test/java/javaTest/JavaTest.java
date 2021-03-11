package javaTest;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class JavaTest {
	
	public ExcelOperation excelOp;
	
	public static void main(String args[]) throws IOException {
		String filePath = "C:\\Users\\33875\\Desktop\\Rest-Assured-sample-framework-master\\Rest-Assured-sample-framework-master\\target\\";
		String fileName = "API-Test.xls";
		String sheetName = "Sheet1";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/firstReport1.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		
		ExcelOperation.readExcel(filePath, fileName, sheetName, extent);
		
	}

}

//package treebo.genericUtility;
//
//import java.io.IOException;
//
//import org.testng.ITestContext;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//public class ListnerImplementation implements ITestListener{
//	ExtentReports reports;
//	
//	@Override//@BT
//	public void onStart(ITestContext context) {
//		ExtentSparkReporter spark = new ExtentSparkReporter("");
//	}
//
//	@Override//@BM
//	public void onTestStart(ITestResult result) {
//		
//	}
//
//	@Override//@AM
//	public void onTestSuccess(ITestResult result) {
//		
//	}
//
//	@Override//@AM
//	public void onTestFailure(ITestResult result) {
//		try {
//			new WebDriverUtility().screenshot(BaseClass.sdriver,BaseClass.sjava,result.getMethod().getMethodName());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	@Override//@AM
//	public void onTestSkipped(ITestResult result) {
//		
//	}
//
//	@Override//@AM
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//		
//	}
//
//	
//
//	@Override//@AT
//	public void onFinish(ITestContext context) {
//		
//	}
//
//}

package treebo.genericUtility;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer {
int count=0;
int maxRetries=4;
	@Override
	public boolean retry(ITestResult result) {
	if(count<maxRetries) {
		count++;
		return true;
	}
		return false;
	}

}

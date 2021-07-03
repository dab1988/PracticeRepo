package extentUtility;

import java.util.Set;

import org.testng.IClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class retryFailedTestCases implements IRetryAnalyzer

{

	int retryCount = 3;
	int counter=1;
	@Override
	public boolean retry(ITestResult result)
	{
		
		if(counter<retryCount)
		{
			counter++;
			return true;
		}
		return false;
	}
			
}

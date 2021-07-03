package TestNG;

import java.util.Set;

import org.testng.IClass;
import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;

public class TestNGListener  implements ITestListener , IExecutionListener ,ITestResult
{

	     public void onStart(ITestContext context)
	     { 
		 System.out.println("onStart method started");
		 }
		 
		 public void onFinish(ITestContext context) {
		 System.out.println("onFinish method started");
		 }
		 
		 public void onTestStart(ITestResult result) {
		 System.out.println("New Test Started" +result.getName());
		 }
		 
		 public void onTestSuccess(ITestResult result) {
		 System.out.println("onTestSuccess Method" +result.getName());
		 }
		 
		 public void onTestFailure(ITestResult result) {
		 System.out.println("onTestFailure Method" +result.getName());
		 }
		 
		 public void onTestSkipped(ITestResult result)
		 {
		 System.out.println("onTestSkipped Method" +result.getName());
		 }
		 
		public void onExecutionFinish() 
		 {
			    System.out.println("**************Execution Finished****************");
		 }

		public void onExecutionStart() 
		 {
			    System.out.println("************Execution Started**********");
		 }

		@Override
		public Object getAttribute(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setAttribute(String name, Object value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public Set<String> getAttributeNames() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object removeAttribute(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int compareTo(ITestResult o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getStatus() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setStatus(int status) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public ITestNGMethod getMethod() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] getParameters() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setParameters(Object[] parameters) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public IClass getTestClass() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Throwable getThrowable() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setThrowable(Throwable throwable) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public long getStartMillis() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long getEndMillis() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void setEndMillis(long millis) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getName() {
			// TODO Auto-generated method stub
			System.out.println(ITestResult.SUCCESS);
			return null;
		}

		@Override
		public boolean isSuccess() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getHost() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getInstance() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] getFactoryParameters() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getTestName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getInstanceName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ITestContext getTestContext() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void setTestName(String name) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public boolean wasRetried()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setWasRetried(boolean wasRetried) {
			// TODO Auto-generated method stub
			
		}
}

package testfail;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * Created by jiaxiong on 2018/12/29
 */
public class TestNgRetry implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int macRetryCount = 3;

    public boolean retry(ITestResult iTestResult){
        if (retryCount < macRetryCount){
            retryCount++;
            return true;
        }
        return false;
    }
}

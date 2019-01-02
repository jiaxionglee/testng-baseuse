package listener;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener2;
import org.testng.ITestContext;
import org.testng.ITestResult;

/**
 * Created by jiaxiong
 * on 2019/1/2
 */
public class IInvokedMethodListener2Imp implements IInvokedMethodListener2 {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        System.out.println("beforeInvocation2：" + testResult.getName() + "，context：" + context.getName());
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult, ITestContext context) {
        System.out.println("afterInvocation2：" + testResult.getName() + "，context：" + context.getName());
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
    }
}

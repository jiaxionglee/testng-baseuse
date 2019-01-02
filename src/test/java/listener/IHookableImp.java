package listener;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;

/**
 * Created by jiaxiong
 * on 2019/1/2
 */
public class IHookableImp implements IHookable {

    @Override
    public void run(IHookCallBack callBack, ITestResult testResult) {
        System.out.println("hookable");
        callBack.runTestMethod(testResult);
    }
}

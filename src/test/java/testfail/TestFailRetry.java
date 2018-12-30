package testfail;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/29
 */
public class TestFailRetry {
    @BeforeTest
    public void bfTest() {
        System.out.println("TestFailRetry beforTest!");
    }

    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = ".*zero")
    public void failTest1() {
        System.out.println("TestFailRetry Test1!");
        int c = 1 / 0;
        Assert.assertEquals("1", "1");
    }

    @Test(retryAnalyzer = TestNgRetry.class)
    @Parameters(value = "para")
    public void failTest2(@Optional("Retry")String str) {
        Assert.assertEquals("1", "2");
        System.out.println("TestFailRetry Test2! "+ str);

    }

    @AfterTest
    public void afTest() {
        System.out.println("TestFailRetry AfterTest!");
    }
}

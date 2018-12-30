package beanshell;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/29
 */
@Test(groups = "test1")
public class TestBeanShell {
    @BeforeTest
    public void bfTest() {
        System.out.println("TestBeanShell beforTest!");
    }

    @Test(expectedExceptions = ArithmeticException.class, expectedExceptionsMessageRegExp = ".*zero")
    public void beanShellTest1() {
        System.out.println("TestBeanShell Test1!");
        int c = 1 / 0;
        Assert.assertEquals("1", "1");
    }

    @Test()
    @Parameters(value = "para")
    public void beanShellTest2(@Optional("Tom")String str) {
        Assert.assertEquals("1", "1");
        System.out.println("TestBeanShell Test2! "+ str);

    }

    @AfterTest
    public void AfTest() {
        System.out.println("TestBeanShell AfterTest!");
    }
}

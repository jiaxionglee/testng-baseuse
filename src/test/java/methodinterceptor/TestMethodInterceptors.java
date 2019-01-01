package methodinterceptor;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2019-01-01 17:44
 */
@Listeners(MethodInterceptors.class)
public class TestMethodInterceptors {

    @BeforeClass
    public void bfClass() {
        System.out.println("BeforeClass");
    }

    @Test(groups = "grp1")
    public void test1() {
        System.out.println("test1");
    }

    @Test(groups = "grp2")
    public void test2() {
        System.out.println("test2");
    }

    @Test(groups = "grp2")
    public void test3() {
        System.out.println("test3");
    }

    @AfterClass
    public void afClass() {
        System.out.println("AfterClass");
    }
}

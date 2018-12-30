package factory;

import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/28
 */
public class MyFactory {

    private String str;

    public MyFactory(String str) {
        this.str = str;
    }

    @Test()
    public void test() {
        System.out.println("MyFactory test: " + str);
    }

    @Test(dependsOnMethods = "test")
    public void test1() {
        System.out.println("MyFactory test1: " + str);
    }
}

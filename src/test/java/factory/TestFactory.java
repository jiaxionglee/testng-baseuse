package factory;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * Created by jiaxiong on 2018/12/28
 */
public class TestFactory {

    @Factory(dataProvider = "n")
    public Object[] test(int n) {
        Object[] object = new Object[n];
        for (int i = 0; i < n; i++) {
            MyFactory myFactory = new MyFactory(i + "");
            object[i] = myFactory;
        }
        return object;
    }

    @DataProvider(name = "n")
    public Object[][] num() {
        return new Object[][]{
                new Object[]{2}
        };
    }
}

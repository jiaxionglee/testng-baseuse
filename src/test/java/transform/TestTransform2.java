package transform;

import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2019-01-01
 */
public class TestTransform2 {
    private String str;

    public TestTransform2(String str) {
        this.str = str;
    }

    @Test()
    public void test() {
        System.out.println("Test annotationTransformer!");
        System.out.println("DataProviderName:" + str);
    }
}

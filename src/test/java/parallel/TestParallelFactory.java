package parallel;

import org.testng.annotations.Factory;

/**
 * Created by jiaxiong on 2018/12/29
 */
public class TestParallelFactory {
    @Factory
    public Object[] test() {
        Object[] object = new Object[3];
        for (int i = 0; i < 3; i++) {
            object[i] = new Parallel1();
        }
        return object;
    }
}

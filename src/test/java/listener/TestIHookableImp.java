package listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong
 * on 2019/1/2
 */
@Listeners(IHookableImp.class)
public class TestIHookableImp {
    @Test
    public void test(){
        System.out.println("test");
    }
}

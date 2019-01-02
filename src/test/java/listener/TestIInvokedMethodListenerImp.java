package listener;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong
 * on 2019/1/2
 */
@Listeners(IInvokedMethodListenerImp.class)
public class TestIInvokedMethodListenerImp {

    @BeforeClass
    public void bfClass(){
        System.out.println("bfClass test");
    }
    @Test
    public void test(){
        System.out.println("test123");
    }
}

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/28
 */
public class BMW extends Car{
    @Test
    public void BMWTest() {
        System.out.println("BMW Test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("BMW AfterClass");
    }
}

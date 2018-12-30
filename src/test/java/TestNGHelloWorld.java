import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/28
 */
public class TestNGHelloWorld {
    @BeforeClass
    public void setUp(){
        System.out.println("setUp!");
    }

    @Test
    public void helloWorld(){
        System.out.println("My first TestNG testCase!");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("tearDown!");
    }
}

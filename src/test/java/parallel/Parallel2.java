package parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/29
 */
public class Parallel2 {

    @BeforeClass
    public void bfClass(){
        long id = Thread.currentThread().getId();
        System.out.println("Parallel2 BeforeClass threadId: "+id);
    }

    @Test
    public void test(){
        long id = Thread.currentThread().getId();
        System.out.println("Parallel2 Test threadId: "+id);
    }

    @AfterClass
    public void afClass(){
        long id = Thread.currentThread().getId();
        System.out.println("Parallel2 AfterClass threadId: "+id);
    }

}

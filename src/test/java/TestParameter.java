import java.lang.reflect.Method;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by jiaxiong on 2018/12/28
 */
public class TestParameter {
    @BeforeTest
    public void bfTest(){
        System.out.println("TestParameter beforeTest");
    }

    @Test
    public void parameterTest1(){
        System.out.println("TestParameter test1");
    }

    @Test
    @Parameters(value = "data")
    public void parameterTest2(@Optional("default") String str){
        System.out.println("TestParameter "+str);
    }

    @Test(dataProvider = "data")
    public void dataProviderTest(String str,Integer integer){
        System.out.println(str+" "+integer);
    }

    @AfterTest
    public void afTest(){
        System.out.println("TestParameter afterTest");
    }

    /**
     * dataProvider实现数据驱动
     */
    @DataProvider(name = "data")
    public Object[][] createData(Method method){
        System.out.println(method.getName());
        return new Object[][]{
                {"test1",new Integer(36) }
        };
    }

    /**
     * 迭代器实现数据驱动
     */
//    @DataProvider(name = "iterator")
//    public Iterable<Object[]> iteratorCreateData(){
//        return new MyIterator(DATA);
//    }

}

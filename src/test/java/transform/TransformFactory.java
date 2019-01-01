package transform;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

/**
 * Created by jiaxiong on 2019-01-01 17:33
 */
public class TransformFactory {
    @Factory(dataProvider = "tom")
    public Object[] transformFac(String str){
        Object[] objects = new Object[1];
        for(int i=0;i<1;i++){
            TestTransform2 testTransform = new TestTransform2(str);
            objects[i] = testTransform;
        }
        return objects;
    }

    @DataProvider(name = "tom")
    public Object[][] tom(){
        return new Object[][]{new Object[]{"tom"}};
    }

    @DataProvider(name = "data")
    public Object[][] data(){
        return new Object[][]{new Object[]{"data"}};
    }
}

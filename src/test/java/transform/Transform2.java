package transform;

import org.testng.IAnnotationTransformer2;
import org.testng.annotations.IConfigurationAnnotation;
import org.testng.annotations.IDataProviderAnnotation;
import org.testng.annotations.IFactoryAnnotation;
import org.testng.annotations.ITestAnnotation;

/**
 * Created by jiaxiong on 2019-01-01
 */
public class Transform2 implements IAnnotationTransformer2 {

    @Override
    public void transform(IConfigurationAnnotation iConfigurationAnnotation, Class aClass,
                          java.lang.reflect.Constructor constructor, java.lang.reflect.Method method) {

    }

    @Override
    public void transform(IDataProviderAnnotation iDataProviderAnnotation, java.lang.reflect.Method method) {
        if (iDataProviderAnnotation.getName().equals("tom"))  //匹配名为data的DataProvider
            iDataProviderAnnotation.setParallel(true); //设置并行
    }

    @Override
    public void transform(IFactoryAnnotation iFactoryAnnotation, java.lang.reflect.Method method) {
        iFactoryAnnotation.setDataProvider("data");
    }

    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, java.lang.reflect.Constructor constructor,
                          java.lang.reflect.Method method) {

    }
}

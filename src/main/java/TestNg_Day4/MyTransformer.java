package TestNg_Day4;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyTransformer implements IAnnotationTransformer {

    @Override
    public void transform(ITestAnnotation annotation,
                          Class testClass,
                          Constructor testConstructor,
                          Method testMethod) {
        if (testMethod != null && "testTransformer".equals(testMethod.getName())) {
            annotation.setInvocationCount(5); // OK: only on ITestAnnotation
            System.out.println("Transformer applied: sampleTest will run 5 times");
        }
    }
}

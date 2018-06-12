package basic;

import java.lang.annotation.*;
import java.lang.reflect.Method;

/**
 * Created by rk0000 on 6/13/18.
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface calculate {
    String name();
}

public class AnnotationCreate {
    @calculate(name="ramesh")
    public void hello() {
        System.out.println("HELLO");
    }

    public static void main(String[] args) throws Exception{
        AnnotationCreate ac = new AnnotationCreate();
        Class cls = ac.getClass();
        Method method = cls.getMethod("hello");
        calculate cal = method.getAnnotation(calculate.class);
        System.out.println(cal.name());
    }
}

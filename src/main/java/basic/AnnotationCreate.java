package basic;

import java.lang.annotation.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by rk0000 on 6/13/18.
 */

@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface calculate {
    String name();
}

@calculate(name="ramesh")
public class AnnotationCreate {
    public void hello() {
        System.out.println("HELLO");
    }
}

class AnnotationSub extends AnnotationCreate {

    public void hello() {
        System.out.println("In subclass");
    }

    public static void main(String[] args) throws Exception{
        AnnotationSub ac = new AnnotationSub();
        Class cls = ac.getClass();
        Annotation cal = cls.getAnnotation(calculate.class);
        calculate ann = (calculate)cal;
        System.out.println(ann.name());
    }
}

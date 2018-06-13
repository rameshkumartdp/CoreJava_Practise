package basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo {

	int val;

	public String getDescription(Object obj) {
		System.out.println("Object");
		return obj.toString();
	}

	public String getDescription(String obj) {
		System.out.println("String");
		return obj;
	}

	public static void main(String[] args) throws Exception{
		Demo d = new Demo();
        Class cls = Class.forName("basic.Singleton");
        /*Method fld= cls.getDeclaredMethod("getInstance",cls);
        fld.setAccessible(true);
        fld.invoke(cls);*/
        Singleton single = (Singleton)cls.newInstance();
        System.out.println("OBJ-------->    "+single);
        System.out.println(d.val);
		d.getDescription(d);
		d.getDescription("Hello");
	}

}

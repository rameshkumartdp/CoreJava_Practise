package basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

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
}

class DemoSub extends Demo {
	@Override
	public String getDescription(String obj) {
		System.out.println("String SUB");
		return obj;
	}

	public static void main(String[] args) throws Exception{
		DemoSub d = new DemoSub();
		d.getDescription("Hello");
		d.getDescription(new Date());
	}
}
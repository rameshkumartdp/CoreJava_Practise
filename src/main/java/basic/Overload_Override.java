package basic;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Date;

public class Overload_Override {

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

class DemoSub extends Overload_Override {
	@Override
	public String getDescription(String obj) {
		System.out.println("String SUB");
		return obj;
	}

//	@Override
//	public String getDescription(Object date) {
//		System.out.println("Object SUB");
//		return date;
//	}

	public static void main(String[] args) throws Exception{
		DemoSub d = new DemoSub();
		d.getDescription("Hello");
		d.getDescription(new Date());
	}
}
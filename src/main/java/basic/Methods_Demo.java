package basic;

import java.lang.reflect.Method;
import java.util.Arrays;

public  class Methods_Demo {
	public static void main(String[] args) {
		Methods_Demo inf = new Methods_Demo();
		System.out.println(inf.getClass().getMethods());
		for(Method method : inf.getClass().getMethods()) {
			System.out.println(method.getName() + " " + Arrays.toString(method.getParameters()));
		}
	}
}

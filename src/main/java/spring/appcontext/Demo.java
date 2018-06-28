package spring.appcontext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void init() {
		System.out.println();
		System.out.println("This is init() method");
	}

	public void destroy() {
		System.out.println();
		System.out.println("This is destroy() method");
	}
}
package spring.factory;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo {
	private String age;
	private Details details;

	Demo() {}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Details getDetails() {
		return details;
	}

	public  void setDetails(Details details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return age;
	}

}
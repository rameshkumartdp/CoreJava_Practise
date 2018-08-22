package spring.singleton;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public enum Demo {

	RAMESH("KUMAR"),
	TOM("JERRY");

	private final String name;
	Demo(String name) {
		this.name = name;
	}

}
package spring.autowire;

public class Demo {
	private String name;
	private AutoDemo auto;

	private Demo(AutoDemo auto) {
		this.auto = auto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AutoDemo getAuto() {
		return auto;
	}

	public void setAuto(AutoDemo auto) {
		this.auto = auto;
	}
}
package basic;

public class Test {

	public Test() {
		System.out.println("Constructor-->");
	}
	
	public void Test() {
		System.out.println("Method------>");
	}
	
	public static void main(String[] args) {
		new Test().Test();
	}

}

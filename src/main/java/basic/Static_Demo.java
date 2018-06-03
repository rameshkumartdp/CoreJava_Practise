package basic;

class MyClass {
	static int val;
}

public class Static_Demo {
	int data=1000;
	public void display() {
		int data = 200;
		System.out.println(this.data+"    "+data);
	}
	public static void main(String[] args) {
		System.out.println(MyClass.val);
		new Static_Demo().display();
	}

}

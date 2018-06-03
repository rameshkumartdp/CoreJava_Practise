package basic;

public class Inheritance_Demo {
	public static void main(String[] args) {
		Super_Demo super1 = new Super_Demo();
		Sub_Demo sub = new Sub_Demo();
		sub.display();
		super1 = sub;
		super1.display();
		sub = (Sub_Demo)super1;
		super1.display();
		
	}
}

class Super_Demo {
	public void display() {
		System.out.println("In SUPER_DEMO");
	}
}

class Sub_Demo extends Super_Demo {
	public void display() {
		super.display();
		System.out.println("In SUB_DEMO");
	}
}
package basic;

abstract class Super_Class {
	 abstract int myMethod();
	 public void display() {
		  System.out.println("ABSTRACT SUPER CLASS------->");
	  }
}

public class Abstract_Demo extends Super_Class {
	
	public int myMethod() {
		return 1;
	}
	public static void main(String[] args) {
		Super_Class su = new Abstract_Demo();
		Abstract_Demo ad = new Abstract_Demo();
		ad.display();
		su.display();
	}

}

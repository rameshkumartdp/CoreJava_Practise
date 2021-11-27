package basic;

interface Mine {
	void print() throws NullPointerException ;
}

class SubClass implements Mine {
	 @Override
	 public void print() {
		System.out.println("-----Parent-------> ");
	}
}

class Parent {
	protected Number display() {
		System.out.println("-----Parent-------> ");
		return 123;
	}
}

public class Override_Demo extends Parent {
	 @Override
	 public Integer display() throws NullPointerException{
		 super.display();
		 System.out.println("-----Child-------> ");
		 return 123;
	}
	public static void main(String[] args) {
		Override_Demo dem = new Override_Demo();
		dem.display();
	}
}

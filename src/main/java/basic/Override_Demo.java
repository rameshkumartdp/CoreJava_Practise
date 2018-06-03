package basic;

interface Mine {
	void print() throws NullPointerException ;
}

class SubClass implements Mine {
	 public void print() {
		System.out.println("-----Parent-------> ");
	}
}

 class Parent {
	protected void display() {
		System.out.println("-----Parent-------> ");
	}
}

public class Override_Demo extends Parent {
	 public void display() throws NullPointerException{
		 super.display();
		System.out.println("-----Child-------> ");
	}
	public static void main(String[] args) {
		Override_Demo dem = new Override_Demo();
		dem.display();
	}
}

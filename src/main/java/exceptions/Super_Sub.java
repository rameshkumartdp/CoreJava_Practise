package exceptions;

public class Super_Sub {
	public void add() throws Exception {}
}

class Sub extends Super_Sub {
	public void add() throws NullPointerException {}

	public static void main(String[] args) {
		new Sub().add();
	}
}
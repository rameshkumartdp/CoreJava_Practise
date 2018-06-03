package exceptions;

interface Parent {
	public int add();
}

interface Child {
	public int add();
}

public class Two_Interfaces implements Parent, Child{

	public int add() {
		int a=10;
		System.out.println("HELLO");
		return a;
	}
	public static void main(String[] args) {
		Two_Interfaces intf = new Two_Interfaces();
		intf.add();
		System.out.println(intf.add());
		System.err.println("ERROR");
	}

}

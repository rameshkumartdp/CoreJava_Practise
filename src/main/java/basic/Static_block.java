package basic;

class Static_block_Super {
	Static_block_Super() {
		System.out.println("Super class ---> ");
	}
}

public class Static_block extends Static_block_Super {

	int d;
	String str;

	static {
		System.out.println("STATIC BLOCK------->");
	}

	{
		System.out.println("Instance block----->");
	}

	Static_block() {
		System.out.println("Constructor1--->");
	}

	Static_block(int age) {
		System.out.println("Constructor2--->");
	}
	public static void main(String[] args) {
		Static_block staticBlock = new Static_block();
		Static_block staticBlock1 = new Static_block(30);
		staticBlock.hashCode();
	}
}

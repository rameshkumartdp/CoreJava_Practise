package basic;

interface First {
	void print();
}

interface Second {
	//String print();
}


public class Multi_Inheritance implements First, Second {
	@Override
	public void print() {}
	//public String print() { return "";}

	public static void main(String[] args) {}
}

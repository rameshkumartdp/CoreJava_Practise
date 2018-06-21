package basic;

public class ClassCasr {

	public static void main(String[] args) {
		Object obj  = new Object();
		String str = (String)obj;  //ClassCastException
		System.out.println(str);
	}

}

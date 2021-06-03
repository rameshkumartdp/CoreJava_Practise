package basic;

public class ClassCasr {

	public static void main(String[] args) {
		Object obj  = new Object();
		String str = (String)obj;  //Sub class object can't be assigned to Super class
		System.out.println(str);
	}

}

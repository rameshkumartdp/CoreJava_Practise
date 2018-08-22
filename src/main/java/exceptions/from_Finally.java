package exceptions;

public class from_Finally {

	public static int myMethod() {
		Exception ex=new Exception();
		try {
			System.out.println(2);
			return 1;
		} catch(Exception e) {
			ex = e;
		} finally {
			System.out.println("IN Finally--------->");
			ex.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		myMethod();
	}

}

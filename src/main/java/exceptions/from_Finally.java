package exceptions;

public class from_Finally {

	public static void main(String[] args) {
		Exception ex=null;
		try {
			System.out.println(10/0);
		} catch(Exception e) {
			ex = e;
		} finally {
			System.out.println("IN Finally--------->");
			ex.printStackTrace();
		}
	}

}

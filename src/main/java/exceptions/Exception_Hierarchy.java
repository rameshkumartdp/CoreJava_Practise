package exceptions;

public class Exception_Hierarchy {
	public static void main(String[] args) {
		try {
			String str = null;
			str.toLowerCase();
		} catch(NullPointerException e) {
			System.out.println("IN NULL ---->");
		} catch(Exception e) {
			System.out.println("IN MAIN ---->");
		} 
	}
}

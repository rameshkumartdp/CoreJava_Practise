package exceptions;

public class Try_return {

	public boolean myMethod() {
		try{
			System.out.println("Stmt1--------->");
			return true;
		} finally {
			System.out.println("Stmt2--------->");
			return true;
		}
		//return true;
	}
	
	public static void main(String[] args) {
		new Try_return().myMethod();
	}

}

package exceptions;

public class Demo {

	public static void main(String[] args) throws Exception{
		int val=100;
		try {
			System.out.println("TRY---->  "+val);
			throw new Exception();
		} catch (Exception e) {
			val=200;
			System.out.println("CATCH---->  "+val);
		} finally {
			val=300;
			System.out.println("FINALLY---->  "+val);
		}

	}

}

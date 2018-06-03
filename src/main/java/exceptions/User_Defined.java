package exceptions;

class MyException extends Exception {
	public MyException(String message){
		super(message);
	}
}

public class User_Defined {
	public static void main(String[] args)  {
		try {
			if(10>5) {
				//throw new Error();
				throw new MyException("This is My Exception");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("INNOCENT STMT");
	}

}

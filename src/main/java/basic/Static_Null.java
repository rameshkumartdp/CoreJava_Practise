package basic;

public class Static_Null {
	
	String str = "hello";
	static void display() {
		System.out.println("-----Display---------->");
	}

	public static void main(String[] args) {
		System.out.println(new Static_Null().str);
		Static_Null obj= null;
		System.out.println("hello".substring(2));
		//System.out.println("hello".substring(-2,2));
		String a = "hello";
		String b = "hello";
		String c = new String("hello");
		if(a==b){
			System.out.println("a=b");
		}
		if(a==c){
			System.out.println("a=c  1");
		}
		if(a==c.intern()){
			System.out.println("a=c  2");
		}
		obj.display();
		
		
		{
			System.out.println("non static blocks in super class is initialized");
		}

		

	}

}

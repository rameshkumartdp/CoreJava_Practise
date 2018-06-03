package basic;

public class String_Demo {
	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.hashCode());
		str = "hello1";
		System.out.println(str.hashCode());
		
		StringBuffer sb = new StringBuffer("hello");
		System.out.println(sb.hashCode());
		sb = new StringBuffer("hello1");
		System.out.println(sb.hashCode());
		int x = 10+1;
		double y = 10.5;
		x+=y;
	System.out.println(y+" "+x);
	}
}

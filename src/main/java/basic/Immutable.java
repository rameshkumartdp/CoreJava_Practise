package basic;

public class Immutable {

	public static void main(String[] args) {
		String str = "hello";
		System.out.println(str.hashCode());
		str = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		
		Integer i1 = 10;
		i1+=20;
		System.out.println(i1);
		String s1=  null;
		System.out.println(s1+"hi");
		System.out.println(2+3+"4");
        System.out.println("2"+3+4);
        
        String mystr = "ramesh";
        mystr.substring(3);
        System.out.println(mystr);
        System.out.println(3*0.1f==0.3);
	}

}

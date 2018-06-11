package basic;

import java.util.Arrays;

public class String_2 {

	public static void main(String[] args) {
		String str = "hello";
		String str2= "hello";
		String str3 = new String("hello");
		System.out.println(str==str2);
		System.out.println(str==str3);
		System.out.println(str3.intern()==str2);
		
		int[] val = {1,2,3};
		System.out.println(Arrays.toString(val).split(","));
	}

}

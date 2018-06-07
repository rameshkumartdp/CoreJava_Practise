package basic;

import java.util.Arrays;

public class String_Format {

	public static void main(String[] args) {
		String names[] = { "www.yahoo.com",  "www.gmail.com",  "www.rediff.com",  "www.arkut.com" };
		System.out.println(Arrays.toString(names));
		for(String str:names){
			System.out.println(str.substring(str.indexOf(".")+1, str.lastIndexOf(".")));
		}
	}

}

package basic;

import java.util.Map;
import java.util.TreeMap;

public class Assign {
	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		int l = 4;
		k = ++k;
		l = l++;   //cannot assign itself
		System.out.println(i++); // 1
		System.out.println(i); // 2
		System.out.println(++j); // 3
		System.out.println(j); // 3
		System.out.println(k); // 4
		System.out.println(l); // 4

	}
}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Singleton_Demo {

	public static void main(String args[]) {
		List myList = new ArrayList();
		myList.add("hello");
		myList.add("JAVA");
		myList.add("hi");
		List numList = Collections.singletonList(myList);

		System.out.println("numList elements: " + numList);

	}
}

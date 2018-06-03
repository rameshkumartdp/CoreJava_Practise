package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Dup_elements {

	public static void main(String[] args) {
		ArrayList<String> letters = new ArrayList<String>();
		Set<String> mySet = new HashSet<String>();
		Set<String> finalSet = new HashSet<String>();

		letters.add("a");
		letters.add("b");
		letters.add("a");
		letters.add("c");
		letters.add("b");
		letters.add("a");
		letters.add("c");
		
		Iterator itr = letters.iterator();
		while(itr.hasNext()) {
			String str = (String) itr.next();
			if(!(mySet.add(str))) {
				finalSet.add(str);
			}
		}

		System.out.println("Elements----->  "+letters);
		System.out.println("Final----->  "+finalSet);
	}

}

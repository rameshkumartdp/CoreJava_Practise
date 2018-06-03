package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Duplicates {

	public static void main(String[] args) {
		Vector<String> vect = new Vector<String>();
		vect.add("Hello");
		vect.add("JAVA");
		vect.add("How");
		vect.add("R U");
		vect.add("Hello");
		System.out.println(vect);
		System.out.println(Arrays.toString(vect.toArray()));
		List<String> list = vect.subList(0, vect.size());
		System.out.println("LIST------->   "+list);
		Set<String> hashSet = new HashSet<String>(vect);
		System.out.println(hashSet);
		Set<String> treeSet = new TreeSet<String>(vect);
		System.out.println(treeSet);
	}

}

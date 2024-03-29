package collections;

import java.util.SortedSet;
import java.util.TreeSet;

class Students implements Comparable<Students> {
	private int id;
	Students(int id){
		this.id=id;
	}

	public int getId() {
		return id;
	}

	@Override
	public int compareTo(Students std) {
		return this.id - std.id;
	}
	
}

public class SortedSet_Demo {

	public static void main(String[] args) {
		SortedSet<Students> tree = new TreeSet<Students>();
	//	tree.add("hello");
		//tree.add(null);
		tree.add(new Students(10) );
		tree.add(new Students(20) );
		tree.add(new Students(50) );
		tree.add(new Students(30) );
		tree.add(new Students(40) );
		
		//tree.add(false);
		tree.forEach((Students obj) -> System.out.println(obj.getId()));
	}

}

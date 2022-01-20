package collections;

import java.util.*;

public class TreeSet_Demo {

	public static void main(String[] args) {
		NavigableSet tree = new TreeSet();
//		tree.add("hello");
//		//tree.add(null);
//		tree.add("hello");
//		tree.add("bye");
//		tree.add("good");
//		tree.add("you");
		//tree.add(false);
		EmployeeBean emp = new EmployeeBean(123, "Ramesh");
		tree.add(emp);
		System.out.println(tree);
		System.out.println(tree.descendingSet());
	}

}


class EmployeeBean implements Comparable<EmployeeBean> {
	private int id;
	private String name;

	public EmployeeBean(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(EmployeeBean bean) {
		return Integer.compare(this.id, bean.id) - (this.name.compareTo(bean.name));
	}

	@Override
	public String toString() {
		return "EmployeeBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
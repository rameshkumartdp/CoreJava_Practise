package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary) {
		this.id= id;
		this.salary=salary;
		this.name=name;
	}
}

public class Sort_Property {

	public static void main(String[] args) {
		Employee e1 = new Employee(4,"Ramesh",12000);
		Employee e2 = new Employee(2,"Suresh",15000);
		Employee e3 = new Employee(1,"Shiva",20000);
		Employee e4 = new Employee(3,"Sunny",90000);
		List<Employee> mySet = new ArrayList<Employee>();
		mySet.add(e1);
		mySet.add(e2);
		mySet.add(e3);
		mySet.add(e4);
		Comparator comp = new Comparator<Employee>() {
				public int compare(Employee e1, Employee e2){
					String name1=e1.name;
					String name2=e2.name;
					return name1.compareTo(name2);
				}};
		Collections.sort(mySet , comp);
		Iterator itr = mySet.iterator();
		while(itr.hasNext()) {
			Employee emp = (Employee)itr.next();
			System.out.println(emp.name);
		}
		//System.out.println(mySet);
	}

}

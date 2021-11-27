package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics_Demo {

	void printData(List<String> data) {
		System.out.println(data);
	}

//	void printData(List<Integer> data) {
//		System.out.println(data);
//	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(10.5);
		list.add("10");
		list.add(true);
		
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}

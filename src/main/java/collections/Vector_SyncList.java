package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class Vector_SyncList {

	public static void main(String[] args) {
		/*Vector vect = new Vector();
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		List syncList = Collections.synchronizedList(list);
		Iterator itr = syncList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		//	list.add(50);
		}*/
		
		List cpList = new CopyOnWriteArrayList();
		cpList.add(10);
		cpList.add(20);
		cpList.add(30);
		cpList.add(40);
		Iterator itr1 = cpList.iterator();
		cpList.add(50);
		cpList.remove(4);
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		if(cpList.contains(20)){
			System.out.println("hi");
		}
	}

}

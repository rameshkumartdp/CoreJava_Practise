package collections;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Collections_Demo {
	public static void main(String[] args) throws Exception{
		
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(null);
		System.out.println(list +"  "+list.add(null));
		Hashtable table = new Hashtable();
		table.put(1,10);
		table.put(2,20);
		table.put(3,30);
		table.put(4,null);
		System.out.println(table);
		
	}

}

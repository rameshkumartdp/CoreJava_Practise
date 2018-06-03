package collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTable_Demo {

	public static void main(String[] args) {
		Hashtable<String,String> table  = new Hashtable<String,String>();
		table.put("Hello","JAVA");
		table.put("Hi","C");
		table.put("Bye","C++");
		table.put("Tata",".Net");
		table.put("Tata","SAP");
	//	table.put("hello",null);
		System.out.println(table);
		Set keys = table.keySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()) {
			System.out.println("VALUEs----->   "+table.get(itr.next()));
		}
		
	}

}

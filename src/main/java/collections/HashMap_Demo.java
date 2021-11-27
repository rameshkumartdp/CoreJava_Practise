package collections;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMap_Demo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap();
		map.put("Ea", "Ramesh");
		map.put("FB", "Kumar");
		map.put(null, "K");
		map.put("Four", "Ramesh");
		map.put("Five", "Kumar");
		map.put("Six", "K");
		map.put("Seven", "Ramesh");
		map.put("Eight", "Kumar");
		map.put("Nine", "Kumar");
		map.put("Ten", "Kumar");
		map.put("Eleven", "Kumar");
		System.out.println(map);
		System.out.println(map.size());
		try {
			Field tableField = HashMap.class.getDeclaredField("table");
			tableField.setAccessible(true);
			Object[] table = (Object[]) tableField.get(map);
			System.out.println(table == null ? 0 : table.length);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Set<String> set = map.keySet();
//		set.add("Twelve");
//		System.out.println(("final map---->  "+map));

		set.remove("Eleven");
		System.out.println(("final map---->  "+map));

		Collection<String> values = map.values();
		//values.add("Twelve");
		values.remove("Ten");
		System.out.println(("final map1---->  "+map));
	}

}

package collections;

import java.lang.reflect.Field;
import java.util.HashMap;

public class LoadFactor {

	public static void main(String[] args) throws Exception {
		HashMap map = new HashMap(10,0.75f);
		map.put("hello1", "hi");
		map.put("hello2", "hi");
		map.put("hello3", "hi");
		map.put("hello4", "hi");
		map.put("hello5", "hi");
		map.put("hello6", "hi");
		map.put("hello7", "hi");
		map.put("hello8", "hi");
		map.put("hello9", "hi");
		map.put("hello10", "hi");
		map.put("hello11", "hi");
		map.put("hello12", "hi");
		map.put("hello13", "hi");
		System.out.println(map.size());

		//find map capacity
		Field tableField = HashMap.class.getDeclaredField("table");
		tableField.setAccessible(true);
		Object[] table = (Object[]) tableField.get(map);
		System.out.println(table == null ? 0 : table.length);
	}

}

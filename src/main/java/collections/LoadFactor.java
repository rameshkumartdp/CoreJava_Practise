package collections;

import java.util.HashMap;

public class LoadFactor {

	public static void main(String[] args) {
		HashMap map = new HashMap(10,12.5f);
		map.put("hello", "hi");
		System.out.println(map.size());
	}

}

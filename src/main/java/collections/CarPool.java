package collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarPool {

	String findBlueCar(String[] floors, String car) {

		String carLocation = null;
		for (String k: floors) {

		//	String[][] arrays = new String[6][9];
		
		//    To find car location from all the floors, have to uncomment line no. 15 
		//	Sample example for single floor.
			String[][] cars = {   {"R","R","R","R","R","R","R","R","R"}, 
												 {"R","R","R","R","R","R","R","R","R"},
												 {"R","R","R","R","R","R","R","R","R"},
												 {"R","R","R","R","B","R","R","R","R"},
												 {"R","R","R","R","R","R","R","R","R"},
												 {"R","R","R","R","R","R","R","R","R"}
											};
			Map<Integer, List<String>> map = new HashMap<Integer, List<String>>();
			List<String> list;
			for (int i = 0; i < cars.length; i++) {
				list = Arrays.asList(cars[i]);
				map.put(i, list);
			}
			for (int i = 0; i < map.size(); i++) {
				for (int j = 0; j < map.get(i).size(); j++) {
					if (map.get(i).get(j).equals(car)) {
						carLocation =  "Car found at floor "+(k)+"  ,"+(i + 1) + " row  " + ", position "+(j + 1);
						break;
					}
				}
			}
		}
		//Now it always finds car location @J floor only
		return carLocation;
	}

	public static void main(String[] args) {
		String[] floors = { "A", "B", "C", "D", "E", "F", "G", "H", "I", "J" };
		CarPool pool = new CarPool();
		System.out.println(pool.findBlueCar(floors, "B"));
	}

}

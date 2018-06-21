package collections;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;

public class WordCount {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/files/1.txt"));
		String str = null;
		Map<String,Integer> map = new HashMap<String,Integer>();
		while ((str = br.readLine()) != null) {
				String[] vals = str.split(" ");
				for(String val:vals) {
					if(map.containsKey(val)) {
						map.put(val, map.get(val)+1);
					} else {
						map.put(val, 1);
					}
				}
		}
		System.out.println("MAP-------->   "+map);
		List<Entry<String,Integer>> myList = new ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(myList, new Comparator<Entry<String,Integer>>() {
			public int compare(Entry<String,Integer> e1, Entry<String,Integer> e2) {
				return e2.getValue().compareTo(e1.getValue());
			}
		});
		ListIterator itr = myList.listIterator(3);
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		System.out.println("LIST------------>   "+myList);
		br.close();
	}

}

package collections;

import java.util.*;

/**
 * Created by rk0000 on 7/28/18.
 */
public class CommonEle4mLists {
    public static void main(String[] args) {
        List list1 = Arrays.asList(1,2,3);
        List list2 = Arrays.asList(3,4,5);
        List list3 = Arrays.asList(5,1,3);
        List<List> mainList = new ArrayList<>();
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int i=0; i<mainList.size(); i++) {
            for(int j=0; j<mainList.get(i).size(); j++) {
                int key = (int) mainList.get(i).get(j);
                if(myMap.containsKey(key)) {
                    myMap.put(key, myMap.get(key)+1);
                } else {
                    myMap.put(key, 1);
                }
            }
        }

        List<Map.Entry<Integer, Integer>> list = new ArrayList(myMap.entrySet());
        for(Map.Entry<Integer, Integer> entry : list) {
            if(entry.getValue() == mainList.size()) {
                System.out.println(entry.getKey());
            }
        }
    }
}

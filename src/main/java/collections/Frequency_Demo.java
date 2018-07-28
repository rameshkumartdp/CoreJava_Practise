package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Frequency_Demo {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(50);
		myList.add(20);
		myList.add(10);
		//System.out.println(Collections.frequency(myList, 20));
		
		try {
			BufferedReader br = new BufferedReader(new FileReader("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/frequency.txt"));
			String str;
			StringBuffer sb = new StringBuffer();
			List<String> fileList;
			while((str=br.readLine())!=null) {
				 sb = sb.append(str+" ");
			}
			String[] array  = sb.toString().split(" ");
			fileList = Arrays.asList(array);
			//System.out.println("File content----->    "+fileList);
			ListIterator<String> itr = fileList.listIterator();
			Map myMap = new LinkedHashMap<>();
			while(itr.hasNext()) {
				String val = itr.next();
				myMap.put(val, Collections.frequency(fileList,val));
				//System.out.println("Frequency  ----  "+val+"   "+Collections.frequency(fileList,val));
			}
			br.close();
			//System.out.println(myMap);
			List<Map.Entry<String, Integer>> list = new ArrayList(myMap.entrySet());
			for(Map.Entry<String, Integer> entry : list) {
				System.out.println(entry.getKey()+"  "+entry.getValue());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}

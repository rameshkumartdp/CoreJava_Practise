package collections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Multi_File_Freq {

	public static void main(String[] args) throws Exception{

		Map<String, Integer> wordMap = new HashMap<String, Integer>();
		BufferedReader br =null;
			File dir = new File("/Users/rk0000/Ramesh/Code/Practise/src/main/resources/files/");  //have 5 files
			for (File file : dir.listFiles()) {
				br = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = br.readLine()) != null) {
					StringTokenizer st = new StringTokenizer(line, " ");
					while (st.hasMoreTokens()) {
						String tmp = st.nextToken().toLowerCase();
						if (wordMap.containsKey(tmp)) {
							wordMap.put(tmp, wordMap.get(tmp) + 1);
						} else {
							wordMap.put(tmp, 1);
						}
					}
				}
			}
			br.close();
			Set keySet = wordMap.keySet();
			String str = null;
			Iterator itr = keySet.iterator();
			while (itr.hasNext()) {
				str = (String) itr.next();
				//printing each word count
				System.out.println(str + " -->  " + wordMap.get(str));
			}
			Set<Entry<String, Integer>> set = wordMap.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
	        for(Map.Entry<String, Integer> entry:list) {
	            System.out.println("Most repeated word:  "+entry.getKey()+" => "+entry.getValue()+" times");
	            break;
	        }
	        String lessRep = null;
	        for(Map.Entry<String, Integer> entry:list){
	        	lessRep = "Less repeated word:  "+entry.getKey()+" => "+entry.getValue()+" times";
	        }
	        System.out.println(lessRep);
			
	}
}

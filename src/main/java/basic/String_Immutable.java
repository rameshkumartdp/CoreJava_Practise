package basic;

import java.util.HashMap;

public class String_Immutable {

	public static void main(String[] args) {
		String s1="one";
        HashMap<String,Integer>  map =  new HashMap<String,Integer>();
        map.put(s1,new Integer(1));
        s1.concat("two");
        System.out.println(map);
        System.out.println(map.get(s1));
        
        StringBuffer s2=new StringBuffer("one");
        HashMap<StringBuffer,Integer>  myMap =  new HashMap<StringBuffer,Integer>();
        myMap.put(s2,new Integer(6));
        s2.append("two");
        System.out.println(myMap);  
        System.out.println(myMap.get(s2));     //here s1=onetwo
        
        String str = "hello";
        str.concat("ram");
        System.out.println(str);

	}

}

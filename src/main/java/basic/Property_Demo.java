package basic;

import java.util.*;

public class Property_Demo {
    public static void main(String[] args) {
//        Map map = System.getenv();
//        Set<Map.Entry> entry = map.entrySet();
//        Iterator itr = entry.iterator();
//        while(itr.hasNext()) {
//            Map.Entry ent = (Map.Entry)itr.next();
//            System.out.println(ent.getKey() + " --> " + ent.getValue());
//        }

        Properties props = System.getProperties();
        Enumeration enu = props.propertyNames();
        while(enu.hasMoreElements()) {
            String str = (String)enu.nextElement();
            System.out.println(str + " --> " + props.getProperty(str));
        }

    }
}

package basic;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rk0000 on 7/15/18.
 */
public class DiffEqualsHashCode {
    public static void main(String[] args) {
        String first = "FB";
        String second = "Ea";
        String third = "k";
        System.out.println("hashCode()---> "+first.hashCode()+"  "+second.hashCode());
        System.out.println("equals()--->  "+first.equals(second));
        System.out.println("hash()--->  "+hash(first)+"  "+hash(second));
        //System.out.println("bucket location --->  "+(hash(first) % (16-1))+"  "+hash(second) % (16 - 1)+"  "+hash(third) % (16 - 1));
        Map map = new HashMap<>();
        map.put(second,2);
        map.put(first,1);
        map.put(null,3);
        map.put(third,4);
        System.out.println(map);
    }

    private static int hash(String s) {
        int hash = 0;
        char[] cArray = s.toCharArray();
        int length = cArray.length;
        for(int i=0; i<length; i++) {
            hash = 31*hash + cArray[i];
            //System.out.println("hash in loop--->  "+hash);
        }
        return hash;
    }
}

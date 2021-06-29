package programs;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by rk0000 on 7/26/18.
 */
public class RemoveAllDuplicatesInString {

    public static String removeDuplicates(String input) {
        Set<Character> mySet = new LinkedHashSet<>();
        for(Character ch: input.toCharArray()) {
            if(!mySet.add(ch)) {
                mySet.remove(ch);
            }
        }

        return mySet.toString().replace(", ","").replace("[","").replace("]","");
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("hello"));
    }
}

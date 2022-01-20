package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Ramesh on 008 08.Dec.21.
 */
public class CruchStones {
    static Integer[] stones = {2,7,4,1,8,1};

    public static int crushStones(Integer[] stones) {
        List<Integer> list = Arrays.asList(stones);
        Set<Integer> set = new TreeSet<>(list);
        System.out.println(set);
        for(int i=0; i<set.size(); i++) {
            
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(crushStones(stones));
    }
}

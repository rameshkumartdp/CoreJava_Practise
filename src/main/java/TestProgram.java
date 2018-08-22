import javax.persistence.criteria.CriteriaBuilder;
import java.util.*;

/**
 * Created by rk0000 on 8/8/18.
 */
public class TestProgram {

    public static void main(String[] args) {
        int[] list1= {23, 56, 78, 98, 78, 56};
        int[] result = new int[list1.length];
        for(int i=list1.length-1; i>=0; i--) {
            //result[i] = list1[i];
            System.out.println(list1[i]);
        }
        //System.out.println(Arrays.toString(result));
    }
}

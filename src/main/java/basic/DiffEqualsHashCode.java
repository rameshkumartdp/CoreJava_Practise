package basic;

/**
 * Created by rk0000 on 7/15/18.
 */
public class DiffEqualsHashCode {
    public static void main(String[] args) {
        String first = "FB";
        String second = "Ea";
        System.out.println("hashCode()---> "+first.hashCode()+"  "+second.hashCode());
        System.out.println("equals()--->  "+first.equals(second));
        System.out.println("hash()--->  "+hash(first)+"  "+hash(second));
    }

    private static int hash(String s) {
        int hash = 0;
        int length = s.length();
        for(int i=0; i<length; i++) {
            char c = s.charAt(i);
            hash = 31*hash + c;
        }
        return hash;
    }
}

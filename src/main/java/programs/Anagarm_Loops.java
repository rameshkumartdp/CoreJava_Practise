package programs;

/**
 * Created by Ramesh on 010 10.Jun.21.
 */
public class Anagarm_Loops {
    public static void main(String[] args) {
        System.out.print("Enter the First String : ");
        String s1 = "ramesh";
        String s2 = "shmera";

        if (checkAnagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are Anagrams");
        else
            System.out.println(s1 + " and " + s2 + " are NOT Anagrams");


    }

    public static boolean checkAnagram(String s1, String s2) {
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();
        if (s1.length() != s2.length())
            return false;
        else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s2 = s2.substring(0, j) + s2.substring(j + 1);
                        break;
                    }
                }
            }

            if (s2.length() == 0) {
                return true;
            } else {
                return false;
            }
        }
    }
}
